package com.momentum.momentum.services;

import com.momentum.momentum.managers.ProductManager;
import com.momentum.momentum.models.Investor;
import com.momentum.momentum.models.Product;
import com.momentum.momentum.persistence.ProductPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductPersistence productPersistence;

    @Autowired
    InvestorService investorService;

    @Override
    public void makeProducts(){
        productPersistence.save(new Product(1, "RETIREMENT", "My Ret", 500));
        productPersistence.save(new Product(1, "SAVINGS", "My Savings", 5000));
        productPersistence.save(new Product(2, "RETIREMENT", "My Ret", 500));

    }

    @Override
    public List<Product> getInvestorProducts(int investorId) {
        return productPersistence.findByInvestorId(investorId);
    }

    @Override
    public String withdraw(int productId, double amount) {
        Product product = productPersistence.findById(productId).get();
        Investor investor = investorService.getInvestorInfo(product.getInvestorId());

        String result = ProductManager.makeWithdrawal(product, amount, investor);

        if(result.toLowerCase().contains("success")) {

            product.setCurrentBalance(product.getCurrentBalance() - amount);
            return String.valueOf(productPersistence.save(product).getCurrentBalance());
        }

        return result;
    }


}

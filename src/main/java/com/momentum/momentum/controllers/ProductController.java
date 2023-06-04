package com.momentum.momentum.controllers;


import com.momentum.momentum.models.Product;
import com.momentum.momentum.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/make")
    public void makeProducts(){
        productService.makeProducts();
    }

    @GetMapping("/investor")
    public List<Product> getInvestorProducts(@RequestParam(name = "investorId") int investorId){
        return productService.getInvestorProducts(investorId);
    }

    @PostMapping("/withdraw")
    public String makeWithdrawal(
            @RequestParam(name = "productId") int productId,
            @RequestParam(name = "amount") double amount){
        return productService.withdraw(productId, amount);
    }
}

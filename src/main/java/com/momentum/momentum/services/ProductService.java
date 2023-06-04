package com.momentum.momentum.services;

import com.momentum.momentum.models.Product;

import java.util.List;

public interface ProductService {

    void makeProducts();

    List<Product> getInvestorProducts(int investorId);

    String withdraw(int productId, double amount);
}

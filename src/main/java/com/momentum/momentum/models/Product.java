package com.momentum.momentum.models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
    @Column
    private int investorId;

    @Column
    private String type;

    @Column
    private String name;

    @Column
    private double currentBalance;

    public Product() {
    }

    public Product(int investorId, String type, String name, double currentBalance) {
        this.investorId = investorId;
        this.type = type;
        this.name = name;
        this.currentBalance = currentBalance;
    }

    //me

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getInvestorId() {
        return investorId;
    }

    public void setInvestorId(int investorId) {
        this.investorId = investorId;
    }
}

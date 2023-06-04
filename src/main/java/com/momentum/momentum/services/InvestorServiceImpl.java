package com.momentum.momentum.services;

import com.momentum.momentum.models.Investor;
import com.momentum.momentum.models.Product;
import com.momentum.momentum.persistence.InvestorPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("InvestorService")
public class InvestorServiceImpl implements InvestorService {

    @Autowired
    InvestorPersistence investorPersistence;

    @Override
    public void makeInvestors() {
        investorPersistence.save(new Investor("Rinae","Tshivhinda","1996-05-02","Pretoria","+27651334733","Rinae2025@mail.com"));
        investorPersistence.save(new Investor("John", "Doe", "1960-01-01", "New York", "+1234567890", "john.doe@mail.com"));
        investorPersistence.save(new Investor("Jane", "Smith", "1995-02-15", "London", "+9876543210", "jane.smith@mail.com"));
    }

    @Override
    public Investor getInvestorInfo(int investorId) {
        return investorPersistence.findById(investorId).get();
    }


    @Override
    public List<Investor> getAllInvestors(){
        return investorPersistence.findAll();
    }



}

package com.momentum.momentum.services;

import com.momentum.momentum.models.Investor;
import com.momentum.momentum.models.Product;

import java.util.List;

public interface InvestorService {
     void makeInvestors();
     Investor getInvestorInfo(int investorId);
     List<Investor> getAllInvestors();

}

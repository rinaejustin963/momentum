package com.momentum.momentum.controllers;

import com.momentum.momentum.models.Investor;
import com.momentum.momentum.services.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investor")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    @PostMapping("/make")
    public void makeInvestors(){
        investorService.makeInvestors();
    }

    @GetMapping("/info")
    public Investor getInvestor(@RequestParam(name = "investorId") int investorId){
       return investorService.getInvestorInfo(investorId);
    }

    @GetMapping("/all")
    public List<Investor> getAllInvestor(){
        return investorService.getAllInvestors();
    }

}

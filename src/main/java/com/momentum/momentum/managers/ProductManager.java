package com.momentum.momentum.managers;

import com.momentum.momentum.models.Investor;
import com.momentum.momentum.models.Product;
import com.momentum.momentum.persistence.InvestorPersistence;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

public class ProductManager {

    @Autowired
    private static InvestorPersistence investorPersistence;

    public static String makeWithdrawal(Product product, double amount, Investor investor) {
        return handleGeneral(product, amount, investor);
    }

    private static String handleGeneral(Product product, double amount, Investor investor){
        double prodBal = product.getCurrentBalance();

        String retirementVal = "success";

        if(product.getType().equalsIgnoreCase("retirement"))
            retirementVal = handleRetirement(investor);

        if(retirementVal.toLowerCase().contains("success")) {

            if (amount > prodBal)
                return "Error: Amount greater than balance";

            else if (amount > (prodBal * 0.9))
                return "Error: amount greater than 90% of balance";

            else
                return "Successful withdrawal of " + amount;
        }
        else return retirementVal;
    }

    private static String handleRetirement( Investor investor) {
        int age = calculateAge(investor.getDob());

        if(age < 65) return "Error: Too Young";
        else return "Success";
    }

    //the method calculates the age
    private static int calculateAge(String dob) {
        LocalDate curDate = LocalDate.now();
        LocalDate convertedDob = LocalDate.parse(dob);

        return Period.between(convertedDob, curDate).getYears();
    }
}

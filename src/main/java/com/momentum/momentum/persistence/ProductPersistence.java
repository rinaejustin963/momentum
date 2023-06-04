package com.momentum.momentum.persistence;

import com.momentum.momentum.models.Investor;
import com.momentum.momentum.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPersistence extends JpaRepository<Product, Integer> {
    List<Product> findByInvestorId(int investorId);
}

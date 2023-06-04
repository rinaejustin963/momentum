package com.momentum.momentum.persistence;

import com.momentum.momentum.models.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorPersistence extends JpaRepository<Investor, Integer> {
}

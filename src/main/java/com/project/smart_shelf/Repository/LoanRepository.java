package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.smart_shelf.Model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    
}

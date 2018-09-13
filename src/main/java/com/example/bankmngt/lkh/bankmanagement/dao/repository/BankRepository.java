package com.example.bankmngt.lkh.bankmanagement.dao.repository;

import com.example.bankmngt.lkh.bankmanagement.dao.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}

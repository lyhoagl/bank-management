package com.example.bankmngt.lkh.bankmanagement.service;

import com.example.bankmngt.lkh.bankmanagement.dao.model.Bank;
import com.example.bankmngt.lkh.bankmanagement.dao.repository.BankRepository;
import com.example.bankmngt.lkh.bankmanagement.dto.BankDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{
    /*public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }*/
@Autowired
    private BankRepository bankRepository;

    @Override
    public void add(BankDTO bankDTO) {
        Bank bank = new Bank();
        bank.setBankName(bankDTO.getBankName());
        bank.setBankAccount(bankDTO.getBankAccount());
        bank.setUserName(bankDTO.getUserName());
        bankRepository.save(bank);
    }
}

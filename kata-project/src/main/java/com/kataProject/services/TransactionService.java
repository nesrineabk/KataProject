package com.kataProject.services;


import com.kataProject.model.BankAccount;
import com.kataProject.model.Transaction;
import com.kataProject.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class TransactionService implements ITransactionService  {


    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public List<BankAccount> getTransactions() {
      return   transactionRepository.findAll();
    }








}

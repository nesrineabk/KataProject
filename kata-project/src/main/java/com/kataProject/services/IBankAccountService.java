package com.kataProject.services;


import com.kataProject.model.BankAccount;
import com.kataProject.model.Transaction;

public interface IBankAccountService {

    public   void deposit(double amount , BankAccount bankAccount  , Transaction transaction );
    public    void deposit(String accountNumber, double amount );
    public    void save( BankAccount bankAccount);
    public BankAccount findById(Long id);
}

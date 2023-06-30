package com.kataProject.services;


import com.kataProject.model.BankAccount;

import java.util.List;


public interface ITransactionService {
    public List<BankAccount> getTransactions();

}

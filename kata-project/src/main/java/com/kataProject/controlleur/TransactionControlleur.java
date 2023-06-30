package com.kataProject.controlleur;


import com.kataProject.model.BankAccount;
import com.kataProject.model.Transaction;
import com.kataProject.repository.TransactionRepository;
import com.kataProject.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Transaction")
public class TransactionControlleur {

    @Autowired
    private TransactionRepository transactionRepository;


    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public BankAccount getTransactionHistory(@RequestParam String account) {
        return  transactionRepository.findByAccountNumber(account);

    }



}

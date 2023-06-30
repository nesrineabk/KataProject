package com.kataProject.model;


import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor

@Table(name = "BANKACCOUNT")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BANKACCOUNT_ID")
    private Long id;

    @Column(name = "BALANCE")
    private double balance;

    @Column(name = "DATE")
    private Date date ;

    @Column(name = "ACCOUNT")
    private String account;



    @OneToMany(mappedBy = "bankAccount", fetch = FetchType.LAZY)
    private List<Transaction> transactions;


    public BankAccount() {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }


    public void deposit(double amount) {
        balance += amount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

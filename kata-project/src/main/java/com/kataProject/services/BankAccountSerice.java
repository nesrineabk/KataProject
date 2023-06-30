package com.kataProject.services;


import com.kataProject.model.BankAccount;
import com.kataProject.model.Transaction;
import com.kataProject.repository.BankAccountRepository;
import com.kataProject.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class BankAccountSerice implements IBankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;


    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void deposit(double amount , BankAccount bankAccount  , Transaction transaction ) {
      /*  double amountValue=0;


        if (amount > 0) {
            amountValue += amount;

            bankAccount.setBalance(amountValue);
        //    Transaction transaction = new Transaction(LocalDate.now(), amount, this.balance , this.oopration );

            transaction.setDate(LocalDate.now());
            transaction.setAmount(amount);




         //  transactionRepository.add(transaction);
        }*/
    }




    @Override
    public BankAccount findById(Long id) {
        Optional<BankAccount> intervenantExterneResult = bankAccountRepository.findById(id);
        BankAccount bank = null;
        if (intervenantExterneResult.isPresent()) {
            bank = intervenantExterneResult.get();
        }
        return bank;
    }


    @Override
    public void deposit(String accountNumber, double amount) {
        BankAccount account = transactionRepository.findByAccountNumber(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }

        account.deposit(amount);
        transactionRepository.save(account);
    }

    @Override
    public void save(BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }
}

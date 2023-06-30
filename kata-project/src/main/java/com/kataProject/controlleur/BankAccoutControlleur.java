package com.kataProject.controlleur;


import com.kataProject.model.BankAccount;
import com.kataProject.services.BankAccountSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BankAccout")
public class BankAccoutControlleur {


    @Autowired
    private BankAccountSerice bankAccountService;


    @PostMapping("/create")
    public BankAccount deposit(@RequestBody BankAccount  bank) {
        bankAccountService.save(bank);
        return bank;
    }


    @PostMapping("/retirer/{id}")
    public void  retirer(@RequestParam double amount , @PathVariable Long id) {
        BankAccount bankAccount    = bankAccountService.findById(id);
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        bankAccountService.save(bankAccount);

    }

    @PostMapping("/deposit/{id}")
    public void  deposit(@RequestParam double amount , @PathVariable Long id) {
        BankAccount bankAccount    = bankAccountService.findById(id);
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        bankAccountService.save(bankAccount);

    }
}

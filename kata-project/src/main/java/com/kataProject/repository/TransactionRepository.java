package com.kataProject.repository;

import com.kataProject.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRepository  extends JpaRepository<BankAccount, Long> {


    @Query(value="SELECT  *  FROM Bankaccount  WHERE account =:account" , nativeQuery = true)
    BankAccount findByAccountNumber(@Param("account") String account);
}

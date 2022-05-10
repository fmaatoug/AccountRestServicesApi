package com.bank.porfolio.accountrestservices.account;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private static List<Account> usersAccounts = new ArrayList<>();
    private static int accountCounter = 0;
    static {
         Account jamesAccount = new Account(++ accountCounter,"james");
         Account tarekAccount = new Account(++ accountCounter,"tarek");

         usersAccounts.add(jamesAccount);
         usersAccounts.add(tarekAccount);
    }

    public double executeOperation(String client  , String type , int ammount) {
        Account account= getAccountByUsername(client);
        if (type.equals("debit") ) {
            account.setBalance( account.getBalance() + ammount);
        } else if (type.equals("credit")) {
            account.setBalance( account.getBalance() - ammount);
        }
        return account.getBalance();
    }

    public double getBalance (String username){
        Account account= getAccountByUsername(username);
        return account.getBalance();
    }

    public Account getAccountByUsername(String username) {
        for (Account account : usersAccounts )
            if (account.getUsername().equals(username)){
                return account;
            }
         return null;
    }
}

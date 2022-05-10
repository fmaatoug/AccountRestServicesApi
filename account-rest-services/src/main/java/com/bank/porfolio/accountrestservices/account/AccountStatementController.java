package com.bank.porfolio.accountrestservices.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to Provide account operations
 * deposit and withDrawals
 *
 * */
@RestController
public class AccountStatementController {

    @Autowired
    private AccountService accountService = new AccountService() ;

    @GetMapping("/AccountStatement/{clientName}")
    public double getAccountBalance(@PathVariable String clientName){
        return accountService.getBalance(clientName) ;
    }

    @PostMapping("/AccountStatement/{clientName}/{type}/{ammount}")
    public void executeOperation (@PathVariable String clientName , @PathVariable String type , @PathVariable("ammount") int ammount){
        accountService.executeOperation(clientName, type , ammount );
    }

}

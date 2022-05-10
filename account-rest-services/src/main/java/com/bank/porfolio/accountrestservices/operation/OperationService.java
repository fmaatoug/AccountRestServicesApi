package com.bank.porfolio.accountrestservices.operation;

import com.bank.porfolio.accountrestservices.account.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OperationService {

    private static List<Operation> userOperations = new ArrayList<Operation>();
    private static int accountCounter = 0 ;
    private static Account jamesAccount = new Account(++ accountCounter, "james");
    private static Account tarekAccount = new Account(++ accountCounter, "tares");

    static {

        userOperations.add(new Operation("debit",new Date(),50, jamesAccount));
        userOperations.add(new Operation("debit",new Date(),60, tarekAccount));
    }

    public List<Operation> findAllOperations() {
        return userOperations;
    }

    public List<Operation> findOperationByUsername( String username){
        List<Operation> userFoundOperation = new ArrayList<>();
        for (Operation operation: userOperations) {
            if (operation.getAccount().getUsername() == username ) {
                 userFoundOperation.add(operation) ;}
            }
        return userFoundOperation;
        }

}

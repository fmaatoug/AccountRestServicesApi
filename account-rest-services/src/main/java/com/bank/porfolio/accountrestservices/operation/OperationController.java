package com.bank.porfolio.accountrestservices.operation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * getting the operations History
 *
 * */
@RestController
public class OperationController {

    @Autowired
    private OperationService operationService;

    @GetMapping("/Operations")
    public List<Operation> getAllOperation() {
       return operationService.findAllOperations();
    }

    @GetMapping("/Operations/{username}")
    public List<Operation> getOperationByUsername(@PathVariable String username) {
       return operationService.findOperationByUsername(username);
    }

}
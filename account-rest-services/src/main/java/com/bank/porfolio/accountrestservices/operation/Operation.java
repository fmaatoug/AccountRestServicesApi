package com.bank.porfolio.accountrestservices.operation;

import com.bank.porfolio.accountrestservices.account.Account;

import java.util.Date;

public class Operation {

    String type;
    Date date;
    double amount;
    double balance;
    Account account;

    public Operation(String type, Date date, double amount, Account account) {
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

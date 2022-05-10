package com.bank.porfolio.accountrestservices.account;

import java.util.Objects;

/**
 * simple representation of a bank account
 * */
public class Account {
    private long id;
    private String username;
    private Double balance;

    public Account(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && username.equals(account.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}

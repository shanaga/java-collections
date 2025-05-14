package com.practice.demo;

public class Account {
    private Integer id;
    private String accountName;

    public Account(Integer id, String accountName) {
        this.id = id;
        this.accountName = accountName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}

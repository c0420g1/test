package com.example.demo.service;

import com.example.demo.model.Account;

public interface AccountService {
    Account getAccount(String username);
    Boolean existsAccountByUsername(String username);
    int saveAccount(Account account);
}

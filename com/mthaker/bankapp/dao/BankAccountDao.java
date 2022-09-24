package com.mthaker.bankapp.dao;

public interface BankAccountDao {

    int createBankAccount(BankAccountDetails bankAccountDetails);

    void subtractFromAccount(int bankAccountId, int amount);
}
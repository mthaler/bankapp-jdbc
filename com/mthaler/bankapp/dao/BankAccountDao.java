package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.BankAccountDetails;

public interface BankAccountDao {

    int createBankAccount(BankAccountDetails bankAccountDetails);

    void subtractFromAccount(int bankAccountId, int amount);
}
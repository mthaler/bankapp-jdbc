package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.FixedDepositDetails;
public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}

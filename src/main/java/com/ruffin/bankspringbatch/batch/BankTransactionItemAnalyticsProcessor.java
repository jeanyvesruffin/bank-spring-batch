package com.ruffin.bankspringbatch.batch;

import org.springframework.batch.item.ItemProcessor;


import com.ruffin.bankspringbatch.dao.BankTransaction;

import lombok.Getter;

//@Component
public class BankTransactionItemAnalyticsProcessor implements ItemProcessor<BankTransaction, BankTransaction> {

	@Getter
	private double totalDebit;
	@Getter
	private double totalCredit;

	@Override
	public BankTransaction process(BankTransaction bankTransaction) throws Exception {
		if (bankTransaction.getTransactionType().equals("D"))
			totalDebit += bankTransaction.getAmount();
		else if (bankTransaction.getTransactionType().equals("C"))
			totalCredit += bankTransaction.getAmount();
		return bankTransaction;
	}

}

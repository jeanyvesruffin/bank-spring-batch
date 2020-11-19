package com.ruffin.bankspringbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ruffin.bankspringbatch.dao.BankTransaction;
import com.ruffin.bankspringbatch.dao.BankTransactionRepository;

@Component
public class BankTransactionItemWriter implements ItemWriter<BankTransaction> {
	@Autowired
	private BankTransactionRepository bankTransactionRepository;

	@Override
	public void write(List<? extends BankTransaction> itemsList) throws Exception {
		// enregistrement en base de donnee
		bankTransactionRepository.saveAll(itemsList);
	}
}

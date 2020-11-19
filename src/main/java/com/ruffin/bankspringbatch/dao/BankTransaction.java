package com.ruffin.bankspringbatch.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class BankTransaction {
	@Id
	private Long id;
	private long accountID;
	private Date transactionDate;
	@Transient
	private String strTransactionDate;
	private String transactionType;
	private double amount;

}

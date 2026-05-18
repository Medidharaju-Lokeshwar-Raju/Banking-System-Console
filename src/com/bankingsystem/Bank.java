package com.bankingsystem;

import java.util.HashMap;

public class Bank {
	private HashMap<String, BankAccount> accounts;

	public Bank() {
		accounts = new HashMap<>();
	}

	// Store account using accountNumber as key
	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
		System.out.println("Account created successfully!");
	}

	// Retrieve account by accountNumber
	public BankAccount getAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
}

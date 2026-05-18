package com.bankingsystem;

public class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance;

	public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

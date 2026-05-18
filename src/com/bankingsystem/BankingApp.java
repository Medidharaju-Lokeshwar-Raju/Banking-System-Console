package com.bankingsystem;

import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		System.out.println("=== Welcome to Banking System ===");

		while (true) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Display Account");
			System.out.println("5. Exit");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter account holder name: ");
				String name = sc.nextLine();
				System.out.print("Enter account number: ");
				String accNo = sc.nextLine();
				System.out.print("Enter initial balance: ");
				double balance = sc.nextDouble();
				BankAccount newAccount = new BankAccount(name, accNo, balance);
				bank.addAccount(newAccount);
				break;

			case 2:
				System.out.print("Enter account number: ");
				accNo = sc.nextLine();
				BankAccount acc = bank.getAccount(accNo);
				if (acc != null) {
					System.out.print("Enter deposit amount: ");
					double depositAmt = sc.nextDouble();
					acc.deposit(depositAmt);
				} else {
					System.out.println("Account not found!");
				}
				break;

			case 3:
				System.out.print("Enter account number: ");
				accNo = sc.nextLine();
				acc = bank.getAccount(accNo);
				if (acc != null) {
					System.out.print("Enter withdrawal amount: ");
					double withdrawAmt = sc.nextDouble();
					acc.withdraw(withdrawAmt);
				} else {
					System.out.println("Account not found!");
				}
				break;

			case 4:
				System.out.print("Enter account number: ");
				accNo = sc.nextLine();
				acc = bank.getAccount(accNo);
				if (acc != null) {
					acc.displayAccountDetails();
				} else {
					System.out.println("Account not found!");
				}
				break;

			case 5:
				System.out.println("Exiting... Thank you!");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}

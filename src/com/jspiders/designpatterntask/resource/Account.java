package com.jspiders.designpatterntask.resource;

public class Account {
	public double accountBalance;
	static Account account;
	private Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public static Account getObject() {
		if(account == null) {
			account = new Account(10000);
		}
		return account;
	}
}

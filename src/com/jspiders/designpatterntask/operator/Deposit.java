package com.jspiders.designpatterntask.operator;

import com.jspiders.designpatterntask.interfaces.Operation;
import com.jspiders.designpatterntask.resource.Account;

public class Deposit implements Operation {
	double depositAmount;
	
	public Deposit(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public void accountOperator() {
		Account account = Account.getObject();
		account.accountBalance += depositAmount;
		System.out.println("The amount of INR "+depositAmount+" has been credited to the account");
		System.out.println("Available balance is INR "+account.accountBalance);
	}

}

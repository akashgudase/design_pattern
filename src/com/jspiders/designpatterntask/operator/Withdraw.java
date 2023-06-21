package com.jspiders.designpatterntask.operator;

import com.jspiders.designpatterntask.interfaces.Operation;
import com.jspiders.designpatterntask.resource.Account;

public class Withdraw implements Operation {
	double withdrawAmount;
	
	public Withdraw(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	public void accountOperator() {
		Account account = Account.getObject();
		account.accountBalance -= withdrawAmount;
		System.out.println("Amount of INR "+withdrawAmount+" has been debited from the account");
		System.out.println("Available balance is INR "+account.accountBalance);
    }

}

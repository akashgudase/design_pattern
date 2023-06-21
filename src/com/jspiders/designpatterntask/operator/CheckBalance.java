package com.jspiders.designpatterntask.operator;

import com.jspiders.designpatterntask.interfaces.Operation;
import com.jspiders.designpatterntask.resource.Account;

public class CheckBalance implements Operation {
	
	@Override
	public void accountOperator() {
		Account account = Account.getObject();
		System.out.println("Available balance is INR "+account.accountBalance);
	}

}

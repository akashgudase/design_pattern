package com.jspiders.designpatterntask.main;

import java.util.Scanner;

import com.jspiders.designpatterntask.interfaces.Operation;
import com.jspiders.designpatterntask.operator.CheckBalance;
import com.jspiders.designpatterntask.operator.Deposit;
import com.jspiders.designpatterntask.operator.Withdraw;
public class AccountMain {
	static Operation operation;
	static Scanner scanner = new Scanner(System.in);
	static boolean condition = true; 
	public static void main(String[] args) {
		while(condition) {
			try {
				bank().accountOperator();
				operation = null;
			} catch(NullPointerException e) {
				System.out.println("Thank you!");
		    }
		}
		scanner.close();
	}
	public static Operation bank() {
			System.out.println("Enter '1' to deposit an amount\nEnter '2' to withdraw an amount\nEnter '3' to check balance\nEnter '4' to Exit ");
			int choice = scanner.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter amount to be deposited");
					double depositAmount = scanner.nextDouble();
					operation = new Deposit(depositAmount);
					return operation;
				case 2:
					System.out.println("Enter amount to be withdrawn");
					double withdrawAmount = scanner.nextDouble();
					operation = new Withdraw(withdrawAmount);
					return operation;
				case 3:
					operation = new CheckBalance();
					return operation;
				case 4:
					condition = false;
					return operation;
				default:
					System.out.println("Invalid selection");
					return operation;
			}
	}

}

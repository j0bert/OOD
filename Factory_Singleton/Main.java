package factory_singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//creates factory object to build accounts
		AccountFactory fact = new AccountFactory();
		
		//base account object
		BankAccount acct = null;
		
		//input account type
		Scanner input = new Scanner(System.in);
		System.out.println("What type of bank account do you want to create? (savings/checking):");
		
		if (input.hasNextLine()){
			String type = input.nextLine();
			acct = fact.makeNewAccount(type);
		}
		else
			System.out.println("Please enter 'savings' or 'checking'.");
		
		//gets more info and output basics of account
		Scanner input1 = new Scanner(System.in);
		System.out.println("Who owns this account?");
		String name = input1.nextLine();
		acct.setAccountOwner(name);
		
		acct.showData();

	}

}

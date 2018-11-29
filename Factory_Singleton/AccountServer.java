package factory_singleton;

import java.util.ArrayList;

public class AccountServer{
	
	//beforehand creates base server object instance to check if it has been created yet
	private static AccountServer firstInstance = null;
	
	//creates server object that is arraylist of accounts
	static ArrayList server = new ArrayList<BankAccount>();
	
	//constructor
	private AccountServer(){};
	
	//checks if server object has been made before and throws error message if it ghas
	public static AccountServer getInstance(){
		if (firstInstance == null)
			firstInstance = new AccountServer();
		else
			System.out.println("Cannot create another Account Server!");
		
		//return single server object
		return firstInstance;
	}

}

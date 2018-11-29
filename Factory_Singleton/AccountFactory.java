package factory_singleton;

public class AccountFactory {

	public BankAccount makeNewAccount(String newAccountType){
		
		//creates base account
		BankAccount newAccount = null;
		
		//creates more specific type of account and adds it to the server
		if (newAccountType.equals("checking")){
			AccountServer.server.add((new CheckingAccount()));
			return new CheckingAccount();
			
		}
		if (newAccountType.equals("savings")){
			AccountServer.server.add((new SavingsAccount()));
			return new SavingsAccount();
		}
		else{
			AccountServer.server.add(newAccount);
			return newAccount;
		}
	}
	
}

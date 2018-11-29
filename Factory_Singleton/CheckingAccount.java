package factory_singleton;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(){
		
		//fills necessary parameters for account
		setAccountID(accountID++);
		setBalance(0);
		setInterestRate(0.22);
		
	}

}

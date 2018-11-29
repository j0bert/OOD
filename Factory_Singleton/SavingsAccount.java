package factory_singleton;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(){
		
		//fills necessary parameters for account
		setAccountID(accountID++);
		setBalance(0);
		setInterestRate(0.12);
		
	}

}

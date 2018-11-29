package factory_singleton;

public abstract class BankAccount {

	//BankAccount object with parameters, getters, and setters
	
	String accountOwner;
	static int accountID;
	int balance;
	double interestRate;
	
	public String getAccountOwner() {return accountOwner;}
	public void setAccountOwner(String accountOwner) {this.accountOwner = accountOwner;}
	
	public int getAccountID() {return accountID;}
	public void setAccountID(int accountID) {this.accountID = accountID;}
	
	public int getBalance() {return balance;}
	public void setBalance(int amount) {this.balance = balance;}
	
	public double getInterestRate() {return interestRate;}
	public void setInterestRate(double interestRate) {this.interestRate = interestRate;}
	
	
	//Outputs account information
	public void showData(){
		System.out.println("This account belongs to " + getAccountOwner() + ". The current balance is " + getBalance() + ". There is an interest"
				+ " rate of " + getInterestRate()*100 + " percent.");
	}
	
}

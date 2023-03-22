package com.maxtrain.banking.account;

public class Account {
	
	private String AccountId = "";
	public String getAccountId() {return this.AccountId;}
	public void setAccountId(String AccountId) { this.AccountId = AccountId;}
	
	private double Balance = 0;
	public double getBalance() {return this.Balance;}
	public void setBalance(double Balance) { this.Balance = Balance;}
	
	private String Description = "";
	public String getDescription() {return this.Description;}
	public void setDescription(String Description) { this.Description = Description;}
	
	// Method to deposit amount into account
	public boolean Deposit(double Amount) {
		if (Amount <= 0) {
			//throw new CantBeZeroException("Exception: Amount can't be less than or equal to zero");
			System.out.println("Exception: Amount can't be less than or equal to zero");
		}
		Balance += Amount;
		return true;
	}
	
	// Method to withdraw amount into account
	public boolean Withdraw(double Amount) {
		if (Amount <= 0) {
			//throw new CantBeZeroException("Exception: Amount can't be less than or equal to zero");
			System.out.println("Exception: Amount can't be less than or equal to zero");
		}
		if (Amount > Balance) {
			//throw new InsufficientFundsException("Exception: Insufficient Funds!", Amount, Balance);
			System.out.println("Exception: Insufficient Funds!");
		}
		Balance -= Amount;
		return true;
	}
	
	// Method to transfer amount to account
	public boolean Transfer(double Amount, Account ToAccount) {
		if (Withdraw(Amount)) {
			ToAccount.Deposit(Amount);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

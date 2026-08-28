package bank;

public abstract class Account implements Transaction{
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	public Account(int accountNumber, String accountHolderName, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		
		if(balance >= 0) {
			this.balance = balance;
		}else {
			this.balance = 0;
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	protected void updateBalance(int amount) {
		balance += amount;
	}
	
	@Override
	public void deposite(int amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println( "'" + amount  + "'" + " credited into your account");
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	@Override
	public abstract void  withdraw(int amount);
	
	public void checkBalance() {
		System.out.println("Available Balance : "  + balance);
	}
	
	public void displayDetails() {
		System.out.println(
				"Account Holder Name : " + accountHolderName + 
				"\nAccount Number : " + accountNumber + 
				"\nAvailable Balance : " + balance
				);
	}
}

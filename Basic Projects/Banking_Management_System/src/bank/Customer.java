package bank;

public class Customer {
	private int customerId;
	private String customerName;
	private Account account;
	
	public Customer(int customerId, String customerName, Account account) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.account = account;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void displayCustomerDetails() {
		System.out.println(
				"Customer ID : " + customerId + 
				"\nCustomer Name : " + customerName + 
				"\nAccount details : " + account
				);
	}
	
	public void deposite(int amount) {
		account.deposite(amount);
	}
	
	public void withdraw(int amount) {
		account.withdraw(amount);
	}
	
}

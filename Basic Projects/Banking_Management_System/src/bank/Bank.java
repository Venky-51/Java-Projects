package bank;

public class Bank {
	private Customer[] customer_arr;
	private int customerCount;
	
	public Bank(int capacity) {
		customer_arr = new Customer[capacity];
		customerCount = 0;
	}
	
	public void addCustomer(Customer c) {
		if(customerCount < customer_arr.length) {
			customer_arr[customerCount ] = c;
			customerCount++;
		}else {
			System.out.println("Bank customer limit reacher");
		}
	}
	
	public void displayAllCustomers() {
		for(int i=0; i<customerCount; i++) {
			customer_arr[i].displayCustomerDetails();
		}
	}
	
	public Customer findCustomer(int customerId) {
		for(int i=0; i<customerCount; i++) {
			if(customer_arr[i].getCustomerId() == customerId) {
				return customer_arr[i];
			}
		}
		return null;
	}
	
	
}

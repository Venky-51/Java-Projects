package bank;

public class Main {
	public static void main(String args[]) {
		Account a1 = 
				new SavingsAccount(101, "venky", 10000, 5);
		
		Customer c1 = 
				new Customer(1, "Venky", a1);
		
		Account a2 = 
				new CurrentAccount(102, "Rahul", 20000, 5000);
		
		Customer c2 =
				new Customer(2, "Rahul", a2);
		
		Account a3 = 
				new SavingsAccount(103, "Vinay", 500, 5);
		
		Customer c3 = 
				new Customer(3, "Vinay", a3);
		
		
		Bank b = new Bank(5);
		b.addCustomer(c1);
	
		b.addCustomer(c2);
		
		b.addCustomer(c3);
		
		b.displayAllCustomers();
		
		Customer found = b.findCustomer(2);
		if(found != null) {
			found.displayCustomerDetails();
		}else {
			System.out.println("Customer not found");
		}
		
		b.findCustomer(2);
	}
}

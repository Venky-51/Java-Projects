package bank;

public class SavingsAccount extends Account {

	double interestRate;

	public SavingsAccount(int accountNumber, String accountHolderName, int balance, double interestRate){

		super(accountNumber, accountHolderName, balance);

		this.interestRate = interestRate;

	}

	public double calculateInterest() {
		return getBalance()*interestRate/100;
	}

	public void displayInterest() {

		System.out.println("Total interest : " + calculateInterest());

	}
	
	@Override
	public void withdraw(int amount) {
		if(amount > 0 && amount <= getBalance()) {
			updateBalance(-amount);
			System.out.println(amount + " debited from savings account");
		}else if(amount <= 0) {
			System.out.println("Invalid withdrawal");
		}else {
			System.out.println("Insufficient funds");
		}
	}

//	public static void main(String args[]) {
//
//		SavingsAccount sa = new SavingsAccount(101, "Venky", 10000, 5);
//
//		sa.displayDetails();
//
//		sa.withdraw(1000);
//		
//		sa.checkBalance();
//
//		sa.calculateInterest();
//		
//		sa.displayInterest();
//
//	}

}
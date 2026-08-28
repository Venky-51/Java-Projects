package bank;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	public CurrentAccount(int accountNumber, String accountHolderName, int balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(int amount) {
		
		double availableAmount = getBalance() + overdraftLimit;
		
		if(amount > 0 && amount <= availableAmount) {
			updateBalance(-amount);
			System.out.println("'" + amount + "'" +  " debited from your account Including overdraft limit");
		}else {
			System.out.println("Invalid withdrawal");
		}
	}
	
	
}

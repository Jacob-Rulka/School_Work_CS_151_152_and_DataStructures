package notes10_22_24;

public class NewAccount {
	private int accountNumber;
	private static int baseaccountNumber= 10000000;
	
	public NewAccount() {
		this.baseaccountNumber++;
		this.accountNumber = baseaccountNumber;
	}
	
	
	int getAccountNumber() {
		return this.accountNumber;
	}
	
}


public class Bank {
	private int accountnumber;
	private String name;
	private double account;
	
	public Bank() {
		
	}
	public Bank(int accountnumber, String name, double account) {
		this.accountnumber = accountnumber;
		this.name = name;
		this.account = account;		
	}


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public double getAccount() {
		return account;
	}


	public void setAccount(double account) {
		this.account = account;
	}


	public void  withdraw(double value) {
		 account = account - (value + 5);
	}
	
	public void deposit(double value) {
		account = account + value;
	}
	public String toString() {
		return "Updated account data" +
				"account: " + this.accountnumber +
				"Holder: " + this.name +
				"Balance: " + this.account;
	}

	
	
}

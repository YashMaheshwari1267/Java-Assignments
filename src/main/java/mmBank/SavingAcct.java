package mmBank;

public class SavingAcct {
	private String name;
	private double balance;
	private int accountNo;
	private static int accountnumber = 1000;
	
	//initializer block
	{
		this.accountNo = accountnumber;
		accountnumber++;
	}

	//parameterized constructor with name and balance 
	public SavingAcct(String name,double balance) {
		 this.name=name;
		 this.balance=balance;
	 }

	//parameterized constructor with name and Balance 0
	public SavingAcct(String name) {
		 this(name,0);
	 }
	
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	//method for withdrawing
	public void withdraw(double withdraw) throws Exception {
		if (balance <= 0) {
			throw new Exception("Balance insufficient.!");
		} else {
			balance -= withdraw;
		}
	}

	//method for depositing
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	
	//method to display account details
	public void display() {
		System.out.println("\nAccount No: " + getAccountNo());
		System.out.println("Name: " + getName());
		System.out.println("Balance: " + getBalance());
	}

	//method to get next account number
	public static void getNextAccountNo() {
		System.out.println("Next account number: " + (accountnumber));
	}
}

package advance.inheritance.assignment;

public class Main {
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(101, "Ankit Shrivastava", 40500, true);
		CurrentAcc ca = new MMCurrentAcc(102, "Vikas Jain", 40000, 10000);
		
		sa.withdraw(5000);
		sa.toString();
		
	}
}

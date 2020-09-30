package advance.inheritance.assignment;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	
	private static final float MINBAL=0;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}


	boolean isSalary() {
		return false;
	}
	
	@Override
	public void withdraw(float amt) {
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}

package advance.inheritance.assignment;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float amt) {
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

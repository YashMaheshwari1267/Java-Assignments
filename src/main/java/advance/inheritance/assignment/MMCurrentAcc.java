package advance.inheritance.assignment;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

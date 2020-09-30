package advance.inheritance.assignment;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal2) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal2;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public int getAccNo() {
		return accNo;
	}

	public float getAccBal() {
		return accBal;
	}

	public void withdraw(float amt) {
		
	}
	
	public void deposit(float amt) {
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

package advance.inheritance.assignment;

public abstract class BankFactory {
	
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
	}
	
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}
	
}

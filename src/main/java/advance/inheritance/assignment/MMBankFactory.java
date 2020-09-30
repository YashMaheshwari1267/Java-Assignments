package advance.inheritance.assignment;

public class MMBankFactory extends BankFactory{
		
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return new MMSavingAcc(accNo, accNm,accBal,isSalaried);
	}
	
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}
}

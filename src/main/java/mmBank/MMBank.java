package mmBank;

public class MMBank {
	public static void main(String[] args) {
		try {
			SavingAcct acc1=new SavingAcct("Yash",4000);
			acc1.display();
			
			SavingAcct acc2=new SavingAcct("Vipul");
			acc2.display();
			
			System.out.println("\n--------Account Status After deposit-------");
			acc1.deposit(1000);
			acc1.display();
			
			acc2.deposit(3000);
			acc2.display();
			
			System.out.println("\n-------Account Status After withdrawl-------- ");
			acc1.withdraw(2000);
			acc1.display();
			
			acc2.withdraw(3000);
			acc2.withdraw(2000);
			acc2.display();
			
			SavingAcct.getNextAccountNo();
			PaymentGateway.transfer(acc1, acc2, 1000);			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

package mmBank;

public class PaymentGateway {
	public static boolean transfer(SavingAcct sender, SavingAcct receiver, double amount) {
		if (sender.getBalance() > amount) {
			try {
				sender.withdraw(amount);
			} 
			catch (Exception e) {
				System.out.println(e);
			}
			receiver.deposit(amount);
			return true;
		} else {
			System.out.println("Balance insuffient.!!");
			return false;
		}
	}
}

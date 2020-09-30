package exception.assignment;

import org.apache.log4j.Logger;

public class Factorial{
	
	public static int getFactorial(int num) {
		
		Logger logger = Logger.getLogger(Factorial.class);
	
		int fact=1;
		try {
			if(num <= 2) {
				throw new InvalidInputException("Invalid Input");
			}
			else {
				fact=1;
				for(int i=num;i>0;i--) {
					fact*=i;
				}
			}
		}
		catch (InvalidInputException e) {
			logger.error("Invalid Input Exception");
		}
		try {
			if(fact > Integer.MAX_VALUE) {
				throw new FactorialException("Factorial exception");
			}
		}
		catch(FactorialException e) {
			logger.error("Factorial exception");
		}
		return fact;
	}
}

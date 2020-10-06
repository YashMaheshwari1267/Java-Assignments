package collection.assignments;

import java.util.*;

public class ParkedSpot {
	private String token;
	public static ArrayList<String> tokens= new ArrayList<String>();

	public String getToken() {
		return token;
	}

	public void generateToken() {
		int floor = (int) (Math.random() * 2) + 1;
		int section = (int) (Math.random() * 3) + 1;
		int spot = (int) (Math.random() * 19) + 1;
		this.token=(floor+" "+section+" "+spot).toString();
		if(!ParkedSpot.tokens.contains(token))
			ParkedSpot.tokens.add(getToken());
		else
			generateToken();
	}
	
	public void removeToken(String token) {
		tokens.remove(token);
	}
}

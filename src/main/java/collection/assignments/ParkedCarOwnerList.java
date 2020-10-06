package collection.assignments;

import java.util.ArrayList;

public class ParkedCarOwnerList {
	
	ArrayList<ParkedCarOwnerDetails> list= new ArrayList<ParkedCarOwnerDetails>();
	String token= new ParkedSpot().getToken();
	
	public String addNewCar(ParkedCarOwnerDetails obj) {
		list.add(obj);
		return this.token;
	}
	
	public void removeCar(String token) {
		ParkedSpot.tokens.remove(token);
	}
	
	public static void getParkedCarLocation(String token) {
		String []location= token.split(" ");
		System.out.println(location[0] + " Floor"+location[1]+" Section"+location[2]+" row");
	}
}

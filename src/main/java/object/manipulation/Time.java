package object.manipulation;

public class Time {
	private int hrs;
	private int mins;
	
	public int getHrs() {
		return hrs;
	}
	public int getMins() {
		return mins;
	}
	
	public void setTime(int hrs, int mins) {
		this.hrs=hrs;
		this.mins=mins;
	}
	
	public String showTime() {
		if(getHrs() < 10)
			return ("Time: 0"+ getHrs() +":"+ getMins()).toString();
		else if(getMins() < 10)
			return ("Time: "+ getHrs() +":0"+ getMins()).toString();
		else
			return ("Time: "+ getHrs() +":"+ getMins()).toString();
	}
	
	public static Time sumTime(Time t1, Time t2) {
		Time t3= new Time();
		t3.hrs = t1.hrs+t2.hrs;
		if(t1.mins+t2.mins >= 60) {
			t3.hrs++;
			t3.mins = (t1.mins+t2.mins) - 60;
		}
		else
			t3.mins = t1.mins+t2.mins;
		return t3;
	}
	
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		t1.setTime(2, 40);
		t2.setTime(8, 25);
		Time t3 = Time.sumTime(t1, t2);
		System.out.println(t3.showTime());
	}
}

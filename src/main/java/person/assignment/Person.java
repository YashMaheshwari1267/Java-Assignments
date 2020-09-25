package person.assignment;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name;
	private Date dob;
	
	class Date {
		private int d;
		private int m;
		private int y;
		
		public Date(int d, int m, int y) {
			super();
			this.d = d;
			this.m = m;
			this.y = y;
		}

		public int getD() {
			return d;
		}

		public int getM() {
			return m;
		}

		public int getY() {
			return y;
		}
	}
	
	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public Person(String name, int d, int m, int y) {
		super();
		this.name = name;
		this.dob = new Date(d,m,y);
	}
	
	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Date of Birth: "+getDob().getD()+"/"+getDob().getM()+"/"+ getDob().getY());
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(getDob().getY(), getDob().getM(), getDob().getD());
		Period p= Period.between(birthday, today);	
		
		System.out.println(p.getYears() +" Years, "+ p.getMonths() + " Months, " + p.getDays() + " Days ");
	}
	
	public String olderOne(Person p) {
		
		LocalDate birthday1 = LocalDate.of(this.getDob().getY(), this.getDob().getM(), this.getDob().getD());
		LocalDate birthday2 = LocalDate.of(p.getDob().getY(), p.getDob().getM(), p.getDob().getD());
		Period period= Period.between(birthday1, birthday2);
		
		
		if(this.getDob().getY() > p.getDob().getY()) {
			return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
		}
		else if(this.getDob().getY() < p.getDob().getY()) {
			return (this.getName() + " is older than " + p.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
		}
		else {
			if(this.getDob().getM() > p.getDob().getM()) {
				return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
			}
			else if(this.getDob().getM() < p.getDob().getM()) {
				return (this.getName() + " is older than " + p.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
			}
			else {
				if(this.getDob().getD() > p.getDob().getD()) {
					return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
				}
				else if(this.getDob().getD() < p.getDob().getD()) {
					return (this.getName() + " is older than " + p.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
				}
				else {
					return "Both have equal ages..!!";
				}
			}
		}
		
	}


	public static void main(String[] args) {
		Person person1 = new Person("Ram",5,6,1980);
		person1.display();
		Person person2 = new Person("Shyam",2,3,1987);
		person2.display();
		System.out.println(person1.olderOne(person2));
	}
}


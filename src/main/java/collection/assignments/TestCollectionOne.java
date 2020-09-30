package collection.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Laptop{
	private String company;
	private String model;
	private String operatingSys;
	private String processor;
	
	public Laptop(String company, String model, String operatingSys, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSys = operatingSys;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSys=" + operatingSys + ", processor="
				+ processor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
	
}

class Car implements Comparable<Car>{
	private String make;
	private String model;
	private int year;
	private int price;
	
	public Car(String make, String model, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public int compareTo(Car c) {
		return this.make.compareTo(c.make);
	}
}

class Television{
	private String company;
	private String type;
	private boolean ThreeD;
	private int price;
	
	public Television(String company, String type, boolean threeD, int price) {
		super();
		this.company = company;
		this.type = type;
		ThreeD = threeD;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", ThreeD=" + ThreeD + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}

class CellPhone{
	private String company;
	private String model;
	private String desc;
	private String operatingSys;
	private int price;
	
	public CellPhone(String company, String model, String desc, String operatingSys, int price) {
		super();
		this.company = company;
		this.model = model;
		this.desc = desc;
		this.operatingSys = operatingSys;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", desc=" + desc + ", operatingSys="
				+ operatingSys + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSys == null) ? 0 : operatingSys.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSys == null) {
			if (other.operatingSys != null)
				return false;
		} else if (!operatingSys.equals(other.operatingSys))
			return false;
		return true;
	}
	
	
}

class School{
	private String name;
	private String city;
	private String district;
	private int greatSchoolRanking;
	
	public School(String name, String city, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", greatSchoolRanking="
				+ greatSchoolRanking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
}

class Students{
	private String name;
	private String favFruit;
	
	public Students(String name, String favFruit) {
		super();
		this.name = name;
		this.favFruit = favFruit;
	}
	
	public String getName() {
		return name;
	}

	public String getFavFruit() {
		return favFruit;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", favFruit=" + favFruit + "]";
	}
	
}

public class TestCollectionOne {
	
	public static void main(String[] args) {
		Laptop l1=new Laptop("hp","notebook1500","windows10","intel-i5");
		Laptop l2=new Laptop("dell","inspiron","windows7","intel-i3");
		Laptop l3=new Laptop("lenevo","thinbook15","windows8","intel-i7");
		Laptop l4=new Laptop("lenevo","thinbook15","windows8","intel-i7");
		
		HashSet<Laptop> laptops= new HashSet<Laptop>();
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		laptops.add(l4);
		
		for(Laptop l: laptops) {
			System.out.println(l);
		}
		
		Car c1=new Car("honda","creta",2019,1200000);
		Car c2=new Car("maruti","swift",2020,900000);
		Car c3=new Car("hyundai","wrv",2017,1000000);
		
		List<Car> carlist= new ArrayList<Car>();
		HashSet<Car> cars= new HashSet<Car>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		
		for(Car c: cars) {
			System.out.println(c);
		}
		
		for(Car c: carlist) {
			System.out.println(c);
		}
		
		Television t1=new Television("mi","led",true,40000);
		Television t2=new Television("realme","led",true,52000);
		Television t3=new Television("sony","plasma",false,20000);
		
		HashSet<Television> tvs= new HashSet<Television>();
		tvs.add(t1);
		tvs.add(t2);
		tvs.add(t3);
		
		for(Television tv: tvs) {
			System.out.println(tv);
		}
		
		CellPhone cp1=new CellPhone("samsung","a50","smartphone","android",18000);
		CellPhone cp2=new CellPhone("apple","iphone7","smartphone","ios",38000);
		CellPhone cp3=new CellPhone("motorola","x70","smartphone","android",14000);
		
		HashSet<CellPhone> phones= new HashSet<CellPhone>();
		phones.add(cp1);
		phones.add(cp2);
		phones.add(cp3);
		
		for(CellPhone cp: phones) {
			System.out.println(cp);
		}
		
		School s1=new School("St. Paul","indore","indore",6);
		School s2=new School("Sri Sathya Sai","vijaipur","guna",2);
		School s3=new School("DC","indore","indore",1);
		
		HashSet<School> schools= new HashSet<School>();
		schools.add(s1);
		schools.add(s2);
		schools.add(s3);
		
		for(School s: schools) {
			System.out.println(s);
		}
		
		Students st1=new Students("yash","apple");
		Students st2=new Students("vipul","orange");
		Students st3=new Students("hardik","mango");
		Students st4=new Students("dinky","pineapple");
		Students st5=new Students("kriti","banana");
		
		Map<String,String> map=new HashMap<String,String>();
		map.put(st1.getName(),st1.getFavFruit());
		map.put(st2.getName(),st2.getFavFruit());
		map.put(st3.getName(),st3.getFavFruit());
		map.put(st4.getName(),st4.getFavFruit());
		map.put(st5.getName(),st5.getFavFruit());
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + "->" +m.getValue());
		} 
	
	}	
}

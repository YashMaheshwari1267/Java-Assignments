package employee.assignment;

public class Employee {
	
	private int id;
	private String name;
	private int monthlyBasic;
	
	public Employee(int id, String name, int monthlyBasic) {
		super();
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMonthlyBasic() {
		return monthlyBasic;
	}
	
	public int getAnnualBasic() {
		int annualBasic = 12 * getMonthlyBasic();
		return annualBasic;
	}
	
	public int getMonthlyGrossSalary() {
		int monthlyGrossSalary = getMonthlyBasic() + (getMonthlyBasic()/2) + 1250 + 800;
		return monthlyGrossSalary;
	}
	
	public int getAnnualGrossSalary() {
		int annualGrossSalary= 12 * getMonthlyGrossSalary();
		return annualGrossSalary;
	}
	
	public int getMonthlyDeductions() {
		float pf = 6500;
		if((10*getMonthlyBasic()/100) < pf )
			pf = (10*getMonthlyBasic()/100);
		float esic = 0;
		if(getMonthlyBasic() <= 5000)
			esic = ((4.75f*getMonthlyBasic()/100));
		int profTax = 100;
		if(getMonthlyGrossSalary() <= 10000)
			profTax=50;
		int monthlyDeductions = (int)(pf + esic + profTax);
		return monthlyDeductions;
	}
	
	public int getMonthlyTakeHome() {
		int monthlyTakeHome= getMonthlyGrossSalary() - getMonthlyDeductions();
		return monthlyTakeHome;
	}
	
	public int getAnnualTakeHome() {
		int annualTakeHome = 12 * getMonthlyTakeHome();
		return annualTakeHome;
	}
	
	public float setPFRate(float f) {
		return f;
	}
	
	public float getPFRate() {
		float PFRate = (10*getMonthlyBasic()/100);
		return PFRate;
	}
	

	public static void main(String[] args) {
		
		Employee e1= new Employee(101,"Rahul Shrivastava",20000);
		
		System.out.println("Id: "+e1.getId());
		System.out.println("Name: "+e1.getName());
		System.out.println("Monthly Basic: "+e1.getMonthlyBasic());
		System.out.println("Annual Basic: "+e1.getAnnualBasic());
		System.out.println("Monthly Gross Salary:"+e1.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary:"+e1.getAnnualGrossSalary());
		System.out.println("Monthly Deductions: "+e1.getMonthlyDeductions());
		System.out.println("Monthly Takehome: "+e1.getMonthlyTakeHome());
		System.out.println("Annual Takehome: "+e1.getAnnualTakeHome());
	}

}

package exception.assignment;

import org.apache.log4j.Logger;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	Logger logger = Logger.getLogger(Student.class);
	
	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		try{
			if(!name.matches("^[a-zA-Z]*$")) {
				throw new NameNotValidException();
			}
			else{
				this.name = name;
			}
		}
		catch(NameNotValidException e) {
			logger.error("Name should not contain numbers or symbols");
		}
		try {
		if(age<15 || age>21) {
			throw new AgeNotWithinRangeException();
		}
		else
			this.age = age;
		}
		catch(AgeNotWithinRangeException e) {
			logger.error("Age should be between 15 and 21");
		}
		
		this.course = course;
	}
	
	
	
	
}

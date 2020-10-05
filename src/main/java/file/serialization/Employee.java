package file.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmployeeData implements Serializable {
	int id;
	String name;
	int Salary;

	public EmployeeData(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return Salary;
	}

}

public class Employee {
	public static void main(String[] args) throws IOException {
		EmployeeData e = new EmployeeData(101, "Yash", 250000);

		FileOutputStream fout = new FileOutputStream("E:/employee.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(e);
		out.flush();
		out.close();
	}
}

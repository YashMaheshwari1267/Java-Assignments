package file.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDataDisplay {
	
	public static void main(String args[]) throws IOException,ClassNotFoundException{
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:/employee.txt"));  	  
		  EmployeeData e = (EmployeeData) in.readObject();
		  System.out.print(e.getName() +" "+e.getId() +" "+ e.getSalary());
		  in.close();
	}
}

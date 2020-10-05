package file.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import org.apache.log4j.Logger;

class MyClassData implements Serializable{
	String name;
	int id;

	public MyClassData(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class MyClass {
	public static void main(String args[]) throws IOException{
		MyClassData m1 = new MyClassData("Yash", 101);
		MyClassData m2 = new MyClassData("Vipul", 102);
		MyClassData m3 = new MyClassData("Swadesh", 103);
		MyClassData m4 = new MyClassData("Arpit", 104);
		MyClassData m5 = new MyClassData("Prakhar", 105);

		ArrayList<MyClassData> list = new ArrayList<MyClassData>();
		Logger logger = Logger.getLogger(MyClass.class);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		try {
			FileOutputStream fout= new FileOutputStream("E:/aa.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(list);
		} catch (FileNotFoundException e) {
			logger.error(e);
		}
	}
}

package streams;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class GetRandomIntegers {
	public static void randomIntegers(String path) throws IOException {
		File file = new File(path);
		FileWriter fr = new FileWriter(file);
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 48) + 1;
			fr.write(num+System.getProperty("line.separator"));
		}
		fr.close();
	}
}

public class RandomIntegers{
	public static void main(String[] args) throws IOException {
		String path= "E:/integers.txt";
		GetRandomIntegers.randomIntegers(path);
		
		List<Integer> ints = Files.lines(Paths.get(path)).map(Integer::parseInt).collect(Collectors.toList());
		
		ArrayList<Integer> newList= new ArrayList<Integer>();
		for(Integer element: ints) {
			if(!newList.contains(element))
				newList.add(element);
		}
		
		FileOutputStream fos = new FileOutputStream("E:/Result.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		Collections.sort(newList);
		for(Integer num: newList) {
			dos.writeInt(num);
			System.out.println(num);
		}
		dos.close();
	}
}

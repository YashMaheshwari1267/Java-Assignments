package lambda.expressions;

import java.io.File;
import java.util.Scanner;

public class SubDirectories {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File directory= new File(path);
		File []subDirectories = directory.listFiles(file -> {return file.isDirectory();});
		
		for(File file: subDirectories)
			System.out.println(file.getName());
		
		sc.close();
	}
}

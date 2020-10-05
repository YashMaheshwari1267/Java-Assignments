package lambda.expressions;

import java.io.File;
import java.util.Scanner;

public class SubFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File file= new File(path);
		File []subFiles = file.listFiles(fil -> {return fil.isFile();});
		
		for(File f: subFiles)
			System.out.println(f.getName());
		
		sc.close();
	}
}

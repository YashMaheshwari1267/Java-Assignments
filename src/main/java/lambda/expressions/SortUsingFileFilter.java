package lambda.expressions;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SortUsingFileFilter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		File directory = new File(path);
		File[] list = directory.listFiles();

		Arrays.sort(list, (f1, f2) -> {
			if (f1.isDirectory() && !f2.isDirectory())
				return -1;
			else if (!f1.isDirectory() && f2.isDirectory())
				return 1;
			else
				return f1.compareTo(f2);

		});

		for (File file : list) {
			System.out.println(file.getName());
		}

		sc.close();
	}
}

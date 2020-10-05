package file.serialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class GrepJava {
	public static ArrayList<String> grep(String path, String keyword) throws IOException{
		int count=0;
		ArrayList<String> lines=new ArrayList<String>();
		Logger logger = Logger.getLogger(GrepJava.class);
		if(FileExist.isFileExist(path)) {
			BufferedReader reader= new BufferedReader(new FileReader(path));
			String line;
			while((line=reader.readLine()) != null) {
				count++;
				if(line.contains(keyword)) {
					lines.add(line);
				}
			}
			reader.close();
		}
		else
			logger.error("File not Found..!!");
		return lines;
	}
}

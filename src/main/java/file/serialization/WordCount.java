package file.serialization;

import java.io.*;

import org.apache.log4j.Logger;

public class WordCount {

	public static int wordCount(String path) throws IOException{
		File file= new File(path);
		int count=0;
		Logger logger = Logger.getLogger(WordCount.class);
		if(FileExist.isFileExist(path)) {
			FileInputStream fis= new FileInputStream(file);
			try {
				byte[] c= new byte[1024];
				fis.read(c);
				logger.info(c.length);
				String s = new String(c);
				String []words= s.split(" ");
				count=words.length+1;
			}
			catch (Exception e) {
				logger.error(e);
			}
			finally {
				fis.close();
			}
		}
		else
			logger.error("File not Found.!!");
		return count;
	}
}

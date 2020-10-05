package file.serialization;

import java.io.*;
import java.io.IOException;

import org.apache.log4j.Logger;

public class LineCount {

	public static int lineCount(String path) throws IOException{
		File file= new File(path);
		int count=0,flag=0;
		Logger logger = Logger.getLogger(LineCount.class);
		if(FileExist.isFileExist(path)) {
			FileInputStream fis= new FileInputStream(file);
			InputStream is= new BufferedInputStream(fis);
			try {
				byte[] c= new byte[1024];
				int readChars=0;
				boolean empty=true;
				boolean endsWithoutNewLine= false;
				while((readChars = is.read(c)) != -1) {
					empty=false;
					for(int i=0;i<readChars;i++) {
						if(c[i] == '\n')
							count++;
					}
					endsWithoutNewLine= c[readChars-1] != '\n';
				}
				if(endsWithoutNewLine)
					count++;
				if(count == 0 && !empty) {
					flag=1;
				}
				else {
					flag=count;
				}
			}
			catch (Exception e) {
				logger.error(e);
			}
			finally {
				is.close();
			}
		}
		else
			logger.error("File not found..!!");
		return flag;
	}
	
}

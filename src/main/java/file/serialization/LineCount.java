package file.serialization;

import java.io.*;
import java.io.IOException;

import org.apache.log4j.Logger;

public class LineCount {

	public static int lineCount(String path) throws IOException{
		File file= new File(path);
		if(FileExist.isFileExist(path)) {
			FileInputStream fis= new FileInputStream(file);
			InputStream is= new BufferedInputStream(fis);
			int count=0;
			Logger logger = Logger.getLogger(LineCount.class);
			
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
				if(count == 0 && !empty)
					return 1;
				else
					return count;
			}
			catch (Exception e) {
				logger.error(e);
			}
			finally {
				is.close();
			}
			return count;
		}
		return 0;
	}
	
}

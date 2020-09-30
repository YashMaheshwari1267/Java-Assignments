package file.serialization;

import java.io.File;

public class FileExist {
	
	public static boolean isFileExist(String path) {
		File file = new File(path);
		if(file.exists())
			return true;
		return false;
	}
}

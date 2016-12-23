import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtil {

	public static File makeAndGetFile(final String fileName) throws IOException {
		File file = FileUtils.getFile(fileName);
		FileUtils.forceMkdir(file);
		
		return file;
	}
	
	public static boolean fileExsits(final String fileName) {
		return new File(fileName).exists();
	}
}

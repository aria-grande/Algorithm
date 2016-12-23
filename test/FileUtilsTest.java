import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FileUtilsTest {

	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void getFileTest() throws IOException {
		final String fileName = "test.txt";
		File file = FileUtil.makeAndGetFile(fileName);
		System.out.println(file.getAbsolutePath());
		assertTrue(FileUtil.fileExsits(fileName));
	}
	
	
	@Test
	public void forEachTest() {
		final int limitation = 1000000;
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < limitation; ++i) {
			list1.add("element" + i);
		}
		
		long startTime1 = System.currentTimeMillis();
		StringBuffer b1 = new StringBuffer();
		for (String elem : list1) {
			b1.append(elem);
		}
		System.out.println("for-each execution time: " + (System.currentTimeMillis() - startTime1));
		
		long startTime2 = System.currentTimeMillis();
		StringBuffer b2 = new StringBuffer();
		int size = list1.size();
		for (int j = 0; j<size; j++) {
			b2.append(list1.get(j));
		}
		System.out.println("for-i execution time: " + (System.currentTimeMillis() - startTime2));
	}
}

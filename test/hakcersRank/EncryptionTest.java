package hakcersRank;

import hackersRank.Encryption;

import org.junit.Ignore;
import org.junit.Test;

public class EncryptionTest {
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void test() {
		Encryption.solve("haveaniceday");
		Encryption.solve("feedthedog");
	}
	
	@Test
	public void test2() {
		Encryption.get("feedthedog");
		Encryption.get("haveaniceday");
		Encryption.get("chillout");
	}
}

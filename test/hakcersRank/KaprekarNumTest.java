package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.KaprekarNum;

import org.junit.Ignore;
import org.junit.Test;

public class KaprekarNumTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void inputIsInvalid() {
		
		System.out.println(Integer.parseInt("ABC"));
	}
	
	@Test
	@Ignore
	public void inputIsValid() {
		String ans = "1 9 45 55 99";
		assertEquals(ans, KaprekarNum.getKaprekarNums(1, 100));
		
		System.out.println(KaprekarNum.getKaprekarNums(1, 99999));
	}
}

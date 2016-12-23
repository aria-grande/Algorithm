package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.TimeInWords;

import org.junit.Test;

public class TimeInWordsTest {

	@Test
	public void Oclock() {
		String tiw = "five o' clock";
		assertEquals(tiw, TimeInWords.timeConvert(5, 0));
	}
	
	@Test
	public void past() {
		String tiw = "one minute past five";
		assertEquals(tiw, TimeInWords.timeConvert(5, 1));
		
		tiw = "eleven minutes past five";
		assertEquals(tiw, TimeInWords.timeConvert(5, 11));
		
		tiw = "twenty nine minutes past five";
		assertEquals(tiw, TimeInWords.timeConvert(5, 29));
		
		tiw = "half past five";
		assertEquals(tiw, TimeInWords.timeConvert(5, 30));
	}
	
	@Test
	public void to() {
		String tiw = "twenty nine minutes to six";
		assertEquals(tiw, TimeInWords.timeConvert(5, 31));
		
		tiw = "quarter to six";
		assertEquals(tiw, TimeInWords.timeConvert(5, 45));
		
		tiw = "eleven minutes to six";
		assertEquals(tiw, TimeInWords.timeConvert(5, 49));
		
	}
}

package hakcersRank;


import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class VeryBigSumTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void N_is_max_and_Elements_are_max_test() {
		int N = Integer.MAX_VALUE;
	}
	
	
	
	private Pattern p1 = Pattern.compile("^(\\D*)(([0-9]{1,2})월)?(([0-9]{1,2})일)?(.*)$");
	
	private int getMonth(String str) {
		Matcher m1 = p1.matcher(str);
		if (m1.find()) {
			for (int i = 0; i < m1.groupCount(); ++i) {
				System.out.println(i + ", " + m1.group(i));
			}
			return Integer.parseInt(m1.group(3));
		}
		return -1;
	}
	
	private int getDate(String str) {
		Matcher m1 = p1.matcher(str);
		if (m1.find()) {
			return Integer.parseInt(m1.group(5));
		}
		return -1;
	}
	
	@Test
	public void matcher_test() {
		String t1 = "삼평동6월16일";
		String t2 = "6월16일삼평동";
		
		assertEquals(6, getMonth(t1));
		assertEquals(16, getDate(t1));
		assertEquals(6, getMonth(t2));
		assertEquals(16, getDate(t2));
	}
}
package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.CommonChild;

import org.junit.After;
import org.junit.Test;

public class CommonChildTest {

	CommonChild c = new CommonChild();
	@After
	public void after() {
		System.out.println("----");
	}
	
	@Test
	public void sameStrings() {
		String s1 = "abcd";
		String s2 = "abcd";
		
		assertEquals(4, c.getMaxLenOfCommonChild(s1, s2));
	}
	
	@Test
	public void inputsAreConsistOfDifferentChars() {
		String s1 = "abcd";
		String s2 = "efgh";
		
		assertEquals(0, c.getMaxLenOfCommonChild(s1, s2));
	}
	
	@Test
	public void testCase1() {
		String s1 = "HARRY";
		String s2 = "SALLY";
		
		assertEquals(2, c.getMaxLenOfCommonChild(s1, s2));
	}
	

	@Test
	public void testCase2() {
		String s1 = "SHINCHAN";
		String s2 = "NOHARAAA";
		
		assertEquals(3, c.getMaxLenOfCommonChild(s1, s2));
	} 
	

	@Test
	public void testCase3() {
		String s1 = "ABCDEF";
		String s2 = "FBDAMN";
		
		assertEquals(2, c.getMaxLenOfCommonChild(s1, s2));
	} 
}

package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.FunnyString;

import org.junit.Test;

public class FunnyStringTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void inputLenIsOddNum() {
		String s = "abcde";
		assertTrue(FunnyString.isFunny(s));
		
		String s2= "acdyz";
		assertFalse(FunnyString.isFunny(s2));
		
	}
	
	@Test
	public void inputLenIsEvenNum() {
		
		String s = "abcd";
		assertTrue(FunnyString.isFunny(s));
		
		String s2 = "acxz";
		assertTrue(FunnyString.isFunny(s2));
		
		String s3 = "acxy";
		assertFalse(FunnyString.isFunny(s3));
		
		String s4 = "ab";
		assertTrue(FunnyString.isFunny(s4));
	}
}

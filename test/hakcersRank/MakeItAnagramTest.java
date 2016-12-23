package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.MakeItAnagram;

import org.junit.Test;

public class MakeItAnagramTest {

	@Test
	public void singleChar() {
		String s1 = "a";
		String s2 = "b";
		
		assertEquals(0, MakeItAnagram.getNumOfDels(s1, s1));
		assertEquals(2, MakeItAnagram.getNumOfDels(s1, s2));
	}
	
	@Test
	public void test() {
		String s1 = "cde";
		String s2 = "abc";
		
		assertEquals(4, MakeItAnagram.getNumOfDels(s1, s2));
	}
}

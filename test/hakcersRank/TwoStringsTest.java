package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.TwoStrings;

import org.junit.Test;

public class TwoStringsTest {

	@Test
	public void singleChar(){
		assertFalse(TwoStrings.isSubString("a", "b"));
		assertTrue(TwoStrings.isSubString("a", "a"));
	}
	
	@Test
	public void test() {
		assertTrue(TwoStrings.isSubString("hello", "world"));
		assertFalse(TwoStrings.isSubString("hi", "world"));
	}
}

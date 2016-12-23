package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.Gemstones;

import org.junit.Test;

public class GemstonesTest {

	@Test
	public void test() {
		String[] input = {"abcdde", "baccd", "eeabg"};
		assertEquals(2, Gemstones.getNumOfGemstones(input));
	}
	
	@Test
	public void test2() {
		String[] input = {"aaa", "aaaaaaaaa", "aaaaaaaa"};
		assertEquals(1, Gemstones.getNumOfGemstones(input));
	}
	
}

package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.AlternatingCharacters;

import org.junit.Test;

public class AlternatingCharactersTest {

	@Test
	public void emptyString() {
		assertEquals(0, AlternatingCharacters.minNumOfDels(""));
	}
	
	@Test
	public void oneSizeString() {
		assertEquals(0, AlternatingCharacters.minNumOfDels("s"));
	}
	
	@Test
	public void twoSizeString() {
		assertEquals(1, AlternatingCharacters.minNumOfDels("ss"));
		assertEquals(0, AlternatingCharacters.minNumOfDels("AB"));
	}
	
	
}

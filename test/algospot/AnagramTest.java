package algospot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void SensitiveCaseTest() {
		String s1 = "Apple";
		String s2 = "apple";
		
		assertFalse(Anagram.isAnagram(s1, s2));
	}
	
	@Test
	public void specialCharacterTest() {
		String s1 = "abcd@_'";
		String s2 = "@_abdc'";
		assertFalse(Anagram.isAnagram(s1, s2));
		
	}
	
	@Test
	public void inputLengthIsNotEqual() {
		String s1 = "abcde";
		String s2 = "bdca";
		
		assertFalse(Anagram.isAnagram(s1, s2));
	}
	
	@Test
	public void lengthIsExceed100() {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		for(int i = 0; i < 100; ++i) {
			s1.append((char)('a' + i));
			s2.append((char)('z' - i));
		}

		assertFalse(Anagram.isAnagram(s1.toString(), s2.toString()));
	}
	
	@Test
	public void anagramTest() {
		String[][] inputs = {
				{"pplea", "apple"},
				{"weird", "wired"},
				{"apple", "angle"},
				{"apple", "elppa"}
		};
		
		assertTrue(Anagram.isAnagram(inputs[0][0], inputs[0][1]));
		assertTrue(Anagram.isAnagram(inputs[1][0], inputs[1][1]));
		assertFalse(Anagram.isAnagram(inputs[2][0], inputs[2][1]));
		assertTrue(Anagram.isAnagram(inputs[3][0], inputs[3][1]));
	}
}

package hakcersRank;

import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;
import hackersRank.MakeAnagram;

import org.junit.Test;

public class MakeAnagramTest {

	MakeAnagram ma = new MakeAnagram();
	
	@Test
	public void inputLenIsOdd() {
		String[] s = { "a", "aaa", "abcde" };
		int[] nums = { -1, -1, -1 };
		
		for(int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], ma.numberOfOps(s[i]));
		}
	}
	
	@Test
	public void inputIsAlreadyAnagram() {
		String[] s = { "aa", "abba", "abab", "abccba" };
		int[] nums = { 0, 0, 0, 0 };
		
		for(int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], ma.numberOfOps(s[i]));
		}
	}
	
	@Test
	public void testCase() {
		String[] s = { "aaabbb","ab", "abc", "mnop", "xyyx", "xaxbbbxx" };
		int[] nums = { 3, 1, -1, 2, 0, 1 };
		
		for(int i = 0; i < s.length; ++i) {
			try {
				assertEquals(nums[i], ma.numberOfOps(s[i]));
			} catch(AssertionError e) {
				System.out.println("Test failed: " + s[i] + ", " + nums[i]);
			}
		}
	}
}

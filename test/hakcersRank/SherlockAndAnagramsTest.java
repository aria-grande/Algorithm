package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.SherlockAndAnagrams;

import org.junit.Test;

public class SherlockAndAnagramsTest {
	SherlockAndAnagrams saa = new SherlockAndAnagrams();
	
	@Test
	public void stringIsConsistOfOneChar() {
		String[] s = { "aa", "aaa", "aaaa" };
		int[] nums = { 1, 4, 10 };
		for (int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], saa.getNumOfAnagramsAmongSubstrings(s[i]));
		}
	}
	
	@Test
	public void stringIsAnagram() {
		String[] s = { "abab", "acbabbac" };
		int[] nums = { 5, 22 };
		for (int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], saa.getNumOfAnagramsAmongSubstrings(s[i]));
		}
	}
	
	@Test
	public void stringIsPalindrome(){
		String[] s = { "aba", "abba", "abcba" };
		int[] nums = { 2, 4, 6 };
		for (int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], saa.getNumOfAnagramsAmongSubstrings(s[i]));
		}
	}
	
	@Test
	public void thereIsNoAnagramAmongSubstring() {
		String[] s = { "abcd", "abcde" };
		int[] nums = { 0, 0 };
		for (int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], saa.getNumOfAnagramsAmongSubstrings(s[i]));
		}
	}
	
	@Test
	public void testCase2() {
		String[] s = { "ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel",
		"gffryqktmwocejbxfidpjfgrrkpowoxwggxaknmltjcpazgtnakcfcogzatyskqjyorcftwxjrtgayvllutrjxpbzggjxbmxpnde",
		"mqmtjwxaaaxklheghvqcyhaaegtlyntxmoluqlzvuzgkwhkkfpwarkckansgabfclzgnumdrojexnrdunivxqjzfbzsodycnsnmw",
		"ofeqjnqnxwidhbuxxhfwargwkikjqwyghpsygjxyrarcoacwnhxyqlrviikfuiuotifznqmzpjrxycnqktkryutpqvbgbgthfges",
		"zjekimenscyiamnwlpxytkndjsygifmqlqibxxqlauxamfviftquntvkwppxrzuncyenacfivtigvfsadtlytzymuwvpntngkyhw"};
		int[] nums = {399, 471, 370, 403, 428};
		
		for (int i = 0; i < s.length; ++i) {
			assertEquals(nums[i], saa.getNumOfAnagramsAmongSubstrings(s[i]));
		}
	}
}

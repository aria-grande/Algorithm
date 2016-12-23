package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.AnagramPalindrome;

import org.junit.Test;

public class AnagramPalindromeTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void InputIsEmpty() {
		String s = "";
		assertFalse(AnagramPalindrome.isPalindrome(s));
	}
	
	@Test
	public void InputIsSingleChar() {
		String s = "a";
		assertTrue(AnagramPalindrome.isPalindrome(s));
	}
	
	@Test
	public void InputLenIsEven() {
		
		String s = "ab";
		assertFalse(AnagramPalindrome.isPalindrome(s));
		
		String s2 = "abab";
		assertTrue(AnagramPalindrome.isPalindrome(s2));
		
		String s3 = "abca";
		assertFalse(AnagramPalindrome.isPalindrome(s3));
	
		// when input's len is even, num of every elements should be even num.
		
	}
	
	@Test
	public void InputLenIsOdd() {
	
		String s = "aba";
		assertTrue(AnagramPalindrome.isPalindrome(s));
		
		String s2 = "ababa";
		assertTrue(AnagramPalindrome.isPalindrome(s2));
		
		String s3 = "abbca";
		assertTrue(AnagramPalindrome.isPalindrome(s3));
		
		String s4 = "cdcdcdcdeeeef";
		assertTrue(AnagramPalindrome.isPalindrome(s4));
		
		String s5 = "cdcdcdcdefg";
		assertFalse(AnagramPalindrome.isPalindrome(s5));
				
		// num of every elements should be (2n, 2n+1) or (2n, 2n, 1)
		// c=4, d=4, e=4, f=1 
		
		
	
	}
	
}

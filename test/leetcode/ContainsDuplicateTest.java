package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicateTest {

	@Test
	public void empty() {
		
	}
	
	@Test
	public void array_is_empty() {
		int[] a1 = {};
		assertFalse(ContainsDuplicate.judge(a1));
	}
	
	@Test
	public void array_len_is_one() {
		int[] a1 = { 1 };
		assertFalse(ContainsDuplicate.judge(a1));
	}
	
	@Test
	public void non_duplicate() {
		int[] a1 = { 1, 2, 3, 4, 5 };
		assertFalse(ContainsDuplicate.judge(a1));
	}
	
	@Test
	public void duplicate() {
		// several duplicates
		int[] a1 = { 3, 4, 2, 3, 4, 1};
		// 1, 2, 3, 4, 4
		assertTrue(ContainsDuplicate.judge(a1));
		
		// only one
		// 1, 3, 3, 4, 5
		int[] a2 = { 3, 4, 3, 1, 5 };
		assertTrue(ContainsDuplicate.judge(a2));
		
	}
}

package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.MaxSubarray;

import org.junit.Test;

public class MaxSubarrayTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void negativeArr() {
		int[] arr = {-4, -1, -2, -3};
		
		int[] ret = MaxSubarray.get(arr);
		assertEquals(-1, ret[0]);
		assertEquals(-1, ret[1]);
	}
	
	@Test
	public void arrIsZero() {
		int[] arr = {0, 0, 0, 0};
		

		int[] ret = MaxSubarray.get(arr);
		assertEquals(0, ret[0]);
		assertEquals(0, ret[1]);
	}
	
	@Test
	public void arrIsAllPositive() {
		int[] arr = {1, 2, 3, 4};
		
		int[] ret = MaxSubarray.get(arr);
		assertEquals(10, ret[0]);
		assertEquals(10, ret[1]);
	}
	
	@Test
	public void arrIsPosAndNeg() {
		int[] arr = {2, -1, 2, 3, 4, -5};

		int[] ret = MaxSubarray.get(arr);
		assertEquals(10, ret[0]);
		assertEquals(11, ret[1]);
	}
}

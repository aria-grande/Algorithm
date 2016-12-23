package hakcersRank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import hackersRank.SherlockAndGCD;

import org.junit.Ignore;
import org.junit.Test;

public class SherlockAndGCDTest {
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void inputIsInvalid() {
		int[] arr = {1, 1, 1};
		assertNull(SherlockAndGCD.isSubsetExist(2, arr));
	}
	
	@Test
	public void edgeCaseTest() {
		int[] arr = {1, 1, 1};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr.length, arr));
		
	}
	
	@Test
	public void gcdExistTest() {
		
		int[] arr = {2, 4, 6};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr.length, arr));
		
		int[] arr2 = {3, 6, 9};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr2.length, arr2));
		
		int[] arr3 = {6, 9};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr3.length, arr3));
		
		int[] arr4 = {1, 2};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr4.length, arr4));
		
		int[] arr5 = {6, 6, 6};
		assertEquals("NO", SherlockAndGCD.isSubsetExist(arr5.length, arr5));
		
	}
	
	@Test
	@Ignore
	public void gcdNoExistTest() {
		int[] arr = {1, 2, 3};
		assertEquals("YES", SherlockAndGCD.isSubsetExist(arr.length, arr));
		
		int[] arr2 = {2, 3, 4};
		assertEquals("YES", SherlockAndGCD.isSubsetExist(arr2.length, arr2));
		
		int[] arr3 = {6, 9, 8};
		assertEquals("YES", SherlockAndGCD.isSubsetExist(arr3.length, arr3));
		
	}
}

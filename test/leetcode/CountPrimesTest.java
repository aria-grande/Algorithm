package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountPrimesTest {

	@Test
	public void empty() {
		
	}
	
	@Test
	public void zero() {
		assertEquals(0, CountPrimes.get(0));
	}
	
	@Test
	public void one() {
		assertEquals(0, CountPrimes.get(1));
	}
	
	@Test
	public void two() {
		assertEquals(0, CountPrimes.get(2));
	}
	
	@Test
	public void number_larger_than_two() {
		
		assertEquals(1, CountPrimes.get(3));
		
		assertEquals(2, CountPrimes.get(5));
		
		assertEquals(3, CountPrimes.get(6));
		assertEquals(3, CountPrimes.get(7));
		
		assertEquals(4, CountPrimes.get(8));
		assertEquals(4, CountPrimes.get(9));
		assertEquals(4, CountPrimes.get(10));
		assertEquals(4, CountPrimes.get(11));
		
		assertEquals(5, CountPrimes.get(12));
	}
}

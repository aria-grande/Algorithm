package shake;

import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.Test;

public class GCDTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void kIsInNFact() {
		int n = 6;
		int[] ks = { 8, 4, 9,3, 25, 5, 12, 60, 15 };
		
		for(int k : ks) {
			assertEquals(GCD.getGcdBruteForce(n, k), GCD.getGcd(n, k));	
		}
	}
	
	@Test
	public void kIsNotInNFact() {
		int n = 6;
		int[] ks = { 7, 9, 11, 13, 15, 17, 19, 23 };
		
		for(int k : ks) {
			assertEquals(GCD.getGcdBruteForce(n, k), GCD.getGcd(n, k));	
		}
	}
	
	@Test
	public void kIsOneAndNIsZero() {
		int n = 0;
		int[] ks = { 1 };
		
		for(int k : ks) {
			assertEquals(GCD.getGcdBruteForce(n, k), GCD.getGcd(n, k));	
		}
	}
	
	@Test
	public void kAndNArePrime() {
		int n = 3;
		int[] ks = { 5, 7, 9, 11 };
		
		for(int k : ks) {
			assertEquals(GCD.getGcdBruteForce(n, k), GCD.getGcd(n, k));	
		}
	}
	
	@Test
	public void test() {
		final int limit = 10000;
		
		for (int i = 0; i < limit; ++i) {
			for (int j = 1; j < limit; ++j) {
				try {
					assertEquals(GCD.getGcdBruteForce(i, j), GCD.getGcd(i, j));
				} catch(AssertionFailedError e) {
					System.out.println("Test failed when i=" +i + ", j= " +j);
				}
			}
		}
	}
}

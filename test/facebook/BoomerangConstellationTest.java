package facebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoomerangConstellationTest {

	@Test
	public void empty() {
		
	}
	
	@Test
	public void test_case1() {
		final int N = 6;
		final int[] X = {5,6,7,6,7,8};
		final int[] Y = {6,5,6,7,8,7};
		
		assertEquals(12, BoomerangConstellations.getBoomerangCount(N, X, Y));
	}
	
	@Test
	public void test_case2() {
		final int N = 3;
		final int[] X = {0,0,0};
		final int[] Y = {0,1,3};
		
		assertEquals(0, BoomerangConstellations.getBoomerangCount(N, X, Y));
	}

	@Test
	public void test_case3() {
		final int N = 4;
		final int[] X = {0,-3,0,-5};
		final int[] Y = {0,4,5,0};
		
		assertEquals(3, BoomerangConstellations.getBoomerangCount(N, X, Y));
	}
	
	@Test
	public void test_case4() {
		final int N = 5;
		final int[] X = {0,0,0,0,0};
		final int[] Y = {0,1,2,3,4};
		
		assertEquals(4, BoomerangConstellations.getBoomerangCount(N, X, Y));
	}
}

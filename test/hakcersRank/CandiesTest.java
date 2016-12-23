package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.Candies;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CandiesTest {

	
	
	@Test
//	@Ignore
	public void empty() {
		// do nothing
	}
	
	@Test
//	@Ignore
	public void scoreIsDecreasing() {
		int[] scores = { 5, 4, 3, 2, 1 };
		assertEquals(15, Candies.getMinCandies(scores));
	}
	
	@Test
	@Ignore
	public void scoreIsIncreasing() {
		int[] scores = { 1, 2, 3, 4, 5 };
		assertEquals(15, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void scoreIsSame() {
		int[] scores = { 2, 2, 2, 2 };
		assertEquals(4, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void test() {
		int[] scores = { 1, 2, 2, 2 };
		assertEquals(5, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void test2() {
		int[] scores = { 1, 3, 2, 4 , 1 };
		assertEquals(7, Candies.getMinCandies(scores));
	}
	
	
	@Test
//	@Ignore
	public void test3() {
		int[] scores = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		assertEquals(19, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void test4() {
		int[] scores = { 2, 5, 2, 3, 4, 2, 1, 3, 4, 1, 2 };
		assertEquals(20, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void test5() {
		int[] scores = { 2, 5, 2, 2, 3, 1 };
		assertEquals(8, Candies.getMinCandies(scores));
	}
	
	@Test
//	@Ignore
	public void test6() {
		int[] scores = {2, 1, 2, 2, 4, 3, 2, 1};
		assertEquals(16, Candies.getMinCandies(scores));
	}
	
}

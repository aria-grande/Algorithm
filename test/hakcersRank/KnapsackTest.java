package hakcersRank;

import static org.junit.Assert.*;

import org.junit.Test;

import shake.Main;

public class KnapsackTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void answerIsZero() {
		
		assertEquals(1, Main.solve(12, 0));
		assertEquals(0, Main.solve(5, 0));
	}
	
	@Test
	public void test2() {
		assertEquals(2, Main.solve(10, 14));
	}
	
	@Test
	public void test3() {
		assertEquals(0, Main.solve(4, 20));
	}
	
	@Test
	public void test4() {
		assertEquals(1, Main.solve(5, 21111111));
	}
	
	@Test
	public void test5() {
		assertEquals(1, Main.solve(5, 21111111));
		assertEquals(2, Main.solve(13, 21111111));
		assertEquals(1, Main.solve(13, 1));
		assertEquals(2, Main.solve(13, 11));
		assertEquals(4, Main.solve(48, 1));
	
	}
	
	@Test
	public void test6() {
		
	}
	
}

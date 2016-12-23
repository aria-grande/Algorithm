package hakcersRank;

import static org.junit.Assert.*;
import hackersRank.SherlockAndSquares;

import org.junit.Test;

public class SherlockAndSquaresTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void edgeCaseTest() {
		assertEquals(1, SherlockAndSquares.numOfSquareInts(1, 1));
		
		int a = (int) Math.pow(10, 9);
		assertEquals(0, SherlockAndSquares.numOfSquareInts(a, a));
	}
	
	@Test
	public void inputIsInvalidTest() {
		int a = (int) Math.pow(10, 9);
		int b = 1;
		assertEquals(-1, SherlockAndSquares.numOfSquareInts(a, b));
	}
	
	@Test
	public void validTest() {
		assertEquals(1, SherlockAndSquares.numOfSquareInts(1, 2));
		assertEquals(2, SherlockAndSquares.numOfSquareInts(3, 9));
		assertEquals(0, SherlockAndSquares.numOfSquareInts(17, 24));
	}
}

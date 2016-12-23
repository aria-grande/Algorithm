package hepc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void scoreIsZero() {
		assertTrue(-1 == A.getAvg(0.0, 1.0, 2.0, 3.0));
	}
	
	@Test
	public void test() {
		assertTrue(5.0 == A.getAvg(5.0, 5.0, 5.0, 5.0));
		assertTrue(6.0 == A.getAvg(6.5, 5.0, 7.0, 6.0));
		assertTrue(5.5 == A.getAvg(6.0, 5.0, 5.0, 5.0));
		assertTrue(5.0 == A.getAvg(5.0, 5.0, 5.0, 4.0));
		
	}
}

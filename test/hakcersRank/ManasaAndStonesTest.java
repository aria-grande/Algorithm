package hakcersRank;

import static org.junit.Assert.assertArrayEquals;
import hackersRank.ManasaAndStones;

import org.junit.Ignore;
import org.junit.Test;

public class ManasaAndStonesTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void edgeTest() {
		final int n = 18, a = 28, b = 28;
		Integer[] result = {476};
		assertArrayEquals(result, ManasaAndStones.getStone(n, a, b));
	}
	
	@Test
	@Ignore
	public void edgeTest2() {
		final int n = 3, a = 1, b = 2;
		Integer[] result = {2, 3, 4};
		assertArrayEquals(result, ManasaAndStones.getStone(n, a, b));
	}
	
	@Test
	@Ignore
	public void edgeTest3() {
		final int n = 4, a = 10, b = 100;
		Integer[] result = {30, 120, 210, 300};
		assertArrayEquals(result, ManasaAndStones.getStone(n, a, b));
	}
}

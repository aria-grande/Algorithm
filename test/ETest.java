import static org.junit.Assert.*;

import org.junit.Test;

import etc.E;


public class ETest {

	@Test
	public void test() {
		int[][] map = 
			{{0, 0, 0, 0, 0, 2, 0},
			 {0, 0, 2, 3, 2, 0, 0},
			 {0, 2, 0, 0, 0, 0, 0},
			 {0, 3, 0, 0, 0, 0, 0},
			 {0, 2, 0, 0, 0, 2, 0},
			 {2, 0, 0, 0, 2, 0, 3},
			 {0, 0, 0, 0, 0, 3, 0}};
		
		int[] exchangeTime = {0, 1, 0, 0, 0, 3, 0};
		
		// assertTrue(13 == E.solve(7, map, exchangeTime, 2, 6));
		
		int time = E.solve(7, map, exchangeTime, 5, 1);
		System.out.println(time);
		assertTrue(4 == time);
	}
}

import static org.junit.Assert.*;

import org.junit.Test;


public class getMaxMineralsTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void mapSizeIsOne() {
		int[][] map = {{1}};
		
		assertEquals(1, MaxMinerals.get(map, 1));
	}
	
	@Test
	public void mapSizeIsThree() {
		int[][] map = {{0,1,0},{0,1,0},{1,1,1}};
		
		assertEquals(4, MaxMinerals.get(map, 3));
	}
	
	@Test
	public void mapSizeIsFive() {
		int[][] map = {{0,1,0,0,1},
						{0,0,1,0,0},
						{1,0,1,1,0},
						{1,1,0,1,0},
						{1,0,0,0,1}};
		
		assertEquals(6, MaxMinerals.get(map, 5));
	}


	@Test
	public void mapSizeIsMax() {
		final int size = 3000;
		int[][] map = new int [size][size];
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				map[i][j] = 0;
			}
		}
		
		map[0][size - 10] = 1;
		
		double st = System.currentTimeMillis();
		
		assertEquals(1, MaxMinerals.get(map, size));
		
		double et = System.currentTimeMillis();
		System.out.println("duration: " + ((et - st) / 1000) + "sec");
	}
}

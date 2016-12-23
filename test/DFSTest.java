import org.junit.Test;

import etc.DFS;


public class DFSTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void inputIsInvalid() {
		int[][] map = new int[9][9];
		map[1][2] = 1;
		map[1][3] = 1;
		map[2][4] = 1;
		map[2][5] = 1;
		map[3][6] = 1;
		map[3][7] = 1;
		map[4][8] = 1;
		map[5][8] = 1;
		map[6][8] = 1;
		map[7][8] = 1;
		
		map[2][1] = 1;
		map[3][1] = 1;
		map[4][2] = 1;
		map[5][2] = 1;
		map[6][3] = 1;
		map[7][3] = 1;
		map[8][4] = 1;
		map[8][5] = 1;
		map[8][6] = 1;
		map[8][7] = 1;
		
		DFS.getOrder(map, 1);
	}
}

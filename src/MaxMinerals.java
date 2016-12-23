
public class MaxMinerals {
	
	public static int get(int[][] m, int size) {
		
		for (int row = 0; row < size; ++row) {
			
			for (int col = 0; col < size; ++col) {
				
				int fromLeft = 0;
				if (row - 1 >= 0)	fromLeft = m[row-1][col];
				
				int fromTop = 0;
				if (col - 1 >= 0)	fromTop = m[row][col-1];
				
				m[row][col] += Math.max(fromLeft, fromTop);
			}
		}
		
		return m[size-1][size-1];
	}
}

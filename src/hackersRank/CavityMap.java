package hackersRank;

import java.util.Scanner;

/*
 * Time: O(n^2)
 * Space: O(n)
 */
public class CavityMap {
	public CavityMap(int n2, int[][] map2) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] map = new int[n][n];
        
        for (int i = 0; i < n; ++i) {
            String[] tmp = in.next().split("");
            for (int j = 0; j < n; ++j) {
                map[i][j] = Integer.parseInt(tmp[j]);               
            }
        }
		
		printCavityMap(getCavityMap(n, map));
	}
	
	private int[][] getCavityMap(int n, int[][] map) {
		if ((map.length != n) && (map[0].length != n)) {
			return null;
		}
		
		// int deepest = maxOf2dArr(map);
		
		for (int i = 0; i < map.length; ++i) {
			int[] row = map[i];
			
			for (int j = 0; j < row.length; ++j) {
				int val = row[j];
				
				if ((i > 0) && (i < (map.length - 1)) 
						&& (j > 0) && (j < (row.length - 1))) {
					// if ((val == deepest)
					if (true
							&& (row[j-1] < val) && (row[j+1] < val) 
							&& (map[i-1][j] < val) && (map[i+1][j] < val)){
						
							row[j] = 10;
					}
				}
			}
		}
		
		return map;
	}
	
	private int maxOf2dArr(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; ++i) {
			int[] row = arr[i];
			
			for(int j = 0; j < arr[i].length; ++j) {
				if ((i > 0) && (i < (arr.length - 1)) 
						&& (j > 0) && (j < (row.length - 1))) {
			
					int val = row[j];
					if (val > max) {
						max = val;
					}
				}
			}
		}
		
		return max;
	}
	
	private void printCavityMap(int[][] map) {
		for (int i = 0; i < map.length; ++i) {
			int[] row = map[i];
			for( int j = 0; j < row.length; ++j) {
				String val = Integer.toString(row[j]);
				if ("10".equals(val)) {
					val = "X";
				}
				
				System.out.print(val);
			}
			System.out.println("");
		}
	}
}

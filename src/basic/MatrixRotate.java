package basic;

public class MatrixRotate {
	public int[][] matrixRotate(int[][] arr, int sp, int ep) {
		if (sp >= ep) {
			printArray(arr);
			return arr;
		}
		
		for (int i = 0; i < (ep - sp); ++i) {
			int s = arr[sp + i][ep];	// second
			int t = arr[ep][ep - i];	// third
			int f = arr[ep - i][sp];	// fourth
			
			arr[sp + i][ep] = arr[sp][sp + i];
			arr[ep][ep - i] = s;
			arr[ep - i][sp] = t;
			arr[sp][sp + i] = f;
		}
		
		return matrixRotate(arr, ++sp, --ep);
		
	}
	
	
	private void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[0].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

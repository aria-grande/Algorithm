package basic;

import org.junit.Ignore;
import org.junit.Test;

public class MatrixRotateTest {
	MatrixRotate mr = new MatrixRotate();
	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void sizeIsTwo() {
		int arr[][] = {{1,2},
					   {3,4}};

		mr.matrixRotate(arr, 0, arr.length - 1);
	}
	
	@Test
	@Ignore
	public void sizeIsThree() {
		int arr[][] = {{1, 2, 3},
					   {4, 5, 6},
					   {7, 8, 9}};

		mr.matrixRotate(arr, 0, arr.length - 1);
	}	

	
	@Test
	@Ignore
	public void sizeIsFour() {
		int arr[][] = {{1, 2, 3, 4},
					   {5, 6, 7, 8},
					   {9, 10, 11, 12},
					   {13, 14, 15, 16}};

		mr.matrixRotate(arr, 0, arr.length - 1);
	}	
	
	@Test
	@Ignore
	public void sizeIsFive() {
		int arr[][] = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15},
					   {16, 17, 18, 19, 20},
					   {21, 22, 23, 24, 25}};

		mr.matrixRotate(arr, 0, arr.length - 1);
	}	
	
}

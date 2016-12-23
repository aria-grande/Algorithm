package hakcersRank;

import hackersRank.CavityMap;

import org.junit.After;
import org.junit.Test;

public class CavityMapTest {
	@After
	public void after() {
		System.out.println("--------");
	}
	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void normal() {
		int n = 4;
		int[][] m = {{1,1,1,2},
					 {1,9,1,2},
					 {1,8,9,2},
					 {1,2,3,4}};
		
		new CavityMap(n, m);
	}
	
	@Test
	public void maxIsOnBorder() {
		int n = 4;
		int[][] m = {{9,1,1,2},
					 {1,8,1,2},
					 {1,1,8,2},
					 {1,2,3,4}};
		
		new CavityMap(n, m);
	}
	
	@Test
	public void cavityIsAdjacent() {
		int n = 4;
		int[][] m = {{1,1,1,2},
					 {1,8,1,2},
					 {1,8,8,2},
					 {1,2,3,4}};
		
		new CavityMap(n, m);
	}
	
	@Test
	public void inputIsWrong() {
		int n = 5;
		int[][] m = {{1,1,1,2},
					 {1,8,1,2},
					 {1,8,8,2},
					 {1,2,3,4}};
		
		new CavityMap(n, m);
	}
}

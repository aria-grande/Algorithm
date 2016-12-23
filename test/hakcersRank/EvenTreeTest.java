package hakcersRank;

import java.util.Scanner;

import org.junit.Test;

public class EvenTreeTest {

	@Test
	public void testcase1() {
		Scanner s = new Scanner(System.in);
		final int M = s.nextInt();
		final int N = s.nextInt();
		int[][] graph = new int[M][M];
		
		for (int i = 0; i < N; ++i) {
			int v1 = s.nextInt() - 1;
			int v2 = s.nextInt() - 1;
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
		}
		
		s.close();
	}
}

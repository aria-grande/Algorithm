package hackersRank;

import java.util.Scanner;

public class EvenTree {

	static int sum = 0;
	
	public static void main(String[] args) {
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
		
		System.out.println(getNumOfRemovedEdgesToMakeForest(graph));
		
		s.close();
	}
	
	public static int getNumOfRemovedEdgesToMakeForest(int[][] graph) {
		final int verticies = graph.length;
		boolean[] visited = new boolean[verticies];
		
		getNumOfNodesBelow(graph, visited, 0);
		
		return sum;
	}
	
	public static int getNumOfNodesBelow(int[][] graph, boolean[] visited, int here) {
		
		final int verticies = graph.length;
		int verNum = 1;

		visited[here] = true;
		
		for (int there = 0 ; there < verticies; ++there) {	
			if (!visited[there] && graph[here][there] == 1) {
				int num = getNumOfNodesBelow(graph, visited, there);
				if (num % 2 == 0) {
					// delete edges
					++sum;
				}
				else {
					verNum += num;
				}
				
			}
		}
		
		return verNum;
				
	}
	
}

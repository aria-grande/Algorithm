
public class DFS {
	
	static int[][] map;
	static int[] visited;
	static StringBuilder ret;
	
	public static void getOrder(int[][] m, int startVertex) {
		
		ret = new StringBuilder();
		visited = new int[m.length];
		map = m;
		
		dfs(1);
		
		System.out.println(ret.toString().trim());
	}
	
	private static void dfs(int vertex) {
		
		if (1 == visited[vertex])	return ;
		
		ret.append(vertex + " ");
		visited[vertex] = 1;
		
		for (int i = 1; i < map.length; ++i) {
			if (1 == map[vertex][i]) {
				dfs(i);
			}
		}
	}
}

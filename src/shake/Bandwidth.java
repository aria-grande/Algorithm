package shake;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bandwidth {


	static class FindUnion {
		
		int parent[];
		int level[];
		
		public FindUnion(int n) {
			// TODO Auto-generated constructor stub
			parent = new int[n];
			level = new int[n];
			
			for(int i = 0; i < n; ++i) {
				parent[i] = i;
				level[i] = 1;
			}
			
		}
		
		int find(int u) {
			//base condition
			if(u == parent[u]) {
				return u;
			}
			return parent[u]=find(parent[u]);
		}
		
		void merge(int u, int v){
			u = find(u);
			v = find(v);
			if(u == v) return;
			if(level[u] > level[v]) {
				parent[v] = u;
			} else {
				parent[u] = v;
				if(level[u] == level[v]) {
					level[v]++;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        
        FindUnion fn = new FindUnion(n);

        for(int i = 0; i < n-1; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            fn.merge(a, b);
        }
        
		System.out.println(solve());
	}
	
	public long solve() {
		
	}
}

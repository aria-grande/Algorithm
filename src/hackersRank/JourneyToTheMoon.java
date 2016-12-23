package hackersRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JourneyToTheMoon {
	
	static class FindUnion {
		
		int parent[];
		int level[];
		int size[];
		
		public FindUnion(int n) {
			// TODO Auto-generated constructor stub
			parent = new int[n];
			level = new int[n];
			size = new int[n];
			
			for(int i = 0; i < n; ++i) {
				parent[i] = i;
				level[i] = 1;
				size[i] = 1;
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
				size[u] += size[v];
			} else {
				parent[u] = v;
				if(level[u] == level[v]) {
					level[v]++;
				}
				size[v] += size[u];
			}
		}
		
		List<Integer> getForestSize() {
			
			boolean[] ari = new boolean[size.length];
			int ariLen = ari.length;
			List<Integer> sizeList = new ArrayList<>();
			
			for(int i =0 ; i < ariLen; ++i) {
				int r = find(i);
				if(!ari[r] && size[r] > 1) {
					sizeList.add(size[r]);
				}
				ari[r] = true;
			}
			return sizeList;
		}
	}

	public static void main(String[] args)  throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
        
        FindUnion fn = new FindUnion(N);

        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            fn.merge(a, b);
        }
        
        List<Integer> countries = fn.getForestSize();

//        // print countries
//        for (int i = 0; i < countries.size(); ++i) {
//        	System.out.println(countries.get(i));
//        }
        
        
        
        long combinations = 0;

        // Compute the final answer - the number of combinations
       int numCs = countries.size();
       int numOfAstr = 0;
       for (int j = 0; j < numCs; ++j) {
    	   int sum = 0;
    	   for (int k = j+1; k < numCs; ++k) {
    		   sum += countries.get(k);
    	   }
    	   combinations += sum * countries.get(j);
    	   numOfAstr += countries.get(j);
       }

       long otherAstr = N - numOfAstr;

       for (int j = 0; j < numCs; ++j) {
    	   combinations += countries.get(j) * otherAstr;
       }
       
       combinations += ((long)(otherAstr * (otherAstr-1))) / 2;
       
       System.out.println(combinations);

	}
	
}

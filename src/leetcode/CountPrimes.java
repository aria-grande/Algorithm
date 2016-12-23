package leetcode;

public class CountPrimes {
	
	public static int get(int n) {
		
		if (n < 3)	return 0;
		
		int cnt = 0;
		int[] checked = new int[n];	// initialized to all 0
		
		for (int i = 2; i < n; ++i) {
			if (checked[i] == 1)	continue;
			
			for (int j = 2; j <= (n-1)/i; ++j) {
				checked[i*j] = 1;
			}
			++cnt;
		}
		
		return cnt;
	}
}

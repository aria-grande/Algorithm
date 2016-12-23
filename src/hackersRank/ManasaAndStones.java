package hackersRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManasaAndStones {
	
	public static Integer[] getStone(int n, int a, int b) {
		
		List<Integer> rs = new ArrayList<Integer>();
		
		if (a == b) {
			rs.add(a * (n-1));
		}
		else {
			for (int x = 0; x < n; ++x) {

				int val = a*x + b*(n-x-1);
				System.out.print(val + ", " );
				if (!rs.contains(val)) {
					rs.add (val);
				}
			}
		}
		
		Integer[] ret = rs.toArray(new Integer[rs.size()]);
		Arrays.sort(ret);
		
		return ret;
	}

	public static void printArray(Integer[] arr) {
		
		final int len = arr.length;
		
		for (int i = 0; i < len; ++i) {
			System.out.print(arr[i]);
			if (i < (len - 1)) {
				System.out.print(" ");
			}
		}
		
		System.out.println("");
	}
}

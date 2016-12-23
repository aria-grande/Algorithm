package facebook;

import java.util.HashMap;
import java.util.Map;

public class BoomerangConstellations {

	public static void main(String[] args) {
		final int N = 6;
		final int[] X = {5,6,7,6,7,8};
		final int[] Y = {6,5,6,7,8,7};
		
		System.out.println(getBoomerangCount(N, X, Y));
		
	}
	
	static int getBoomerangCount(final int N, final int[] X, final int[] Y) {
		int total = 0;
		
		double[][] mat = createDistMatrix(N, X, Y);		
		for(double[] from : mat) {
			// create count map
			Map<Double, Integer> distCnt = new HashMap<Double, Integer>();
			for(double d : from) {
				int val = distCnt.getOrDefault(d, 0) + 1;
				distCnt.put(d, val);
			}
			// count, ignoring keys that counts under 2
			for(int cnt : distCnt.values()) {
				if (cnt >= 2) {
					total += combination(cnt, 2);
				}
			}
		}
		
		return total;
	}
	
	private static double[][] createDistMatrix(final int N, final int[] X, final int[] Y) {
		double[][] dist = new double[N][N];
		for(int from = 0; from < N; ++from) {
			for(int to = 0; to < N; ++to) {
				double powX = Math.pow(X[from]-X[to], 2);
				double powY = Math.pow(Y[from]-Y[to], 2);
				dist[from][to] = Math.cbrt(powX + powY);
			}
		}
		return dist;
	}
	
	private static int combination(final int N, final int R) {
		int res = 1;
		for (int n = N; n > N-R; --n) {
			res *= n;
		}
		for (int r = R; r > 1; --r) {
			res /= r;
		}
		return res;
	}
}

package hackersRank;

public class RedJohnIsBack {

	public int solve(final int N) {
		
		int numOfWay = 0;
		for (int i = 0; N >= 4*i; ++i) {
			numOfWay += combination(N-3*i, i);
		}

		return getNumOfPrimeUpTo(numOfWay);
	}
	
	public int combination(int n, int a) {
		if (n == 1 || a == 0 || n == a)	return 1;
		if (a == 1)	return n;
		
		int ret = 1;
		for (int i = 1; i <= a; ++i) {
			ret *= n--;
			ret /= i;
		}
		
		return ret;
	}
	
	public int getNumOfPrimeUpTo(int n) {

		int cnt = 0;
		boolean[] isNotPrime = new boolean[n+1];
		
		for (int i = 2; i <= n; ++i) {

			if (!isNotPrime[i]) {
				for (int j = 2*i; j <= n; j += i) {
					isNotPrime[j] = true;
				}
				++cnt;
			}
		}

		return cnt;
	}
}

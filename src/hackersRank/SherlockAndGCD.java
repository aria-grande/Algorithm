package hackersRank;

public class SherlockAndGCD {
	public static String isSubsetExist(int N, int[] arr) {
		
		if (N != arr.length)	return null;
		
		int curGcd = arr[0];
		for (int i = 1; i < N; ++i) {
            int v2 = arr[i];
            
            curGcd = gcd(curGcd, v2);
       		if ((v2 != 1) && (curGcd == 1))  break;
       	}
         
        return (arr[0] != 1) && (curGcd == 1) ? "YES" : "NO";
	}
	
	private static int gcd(int a, int b) {
		int min = Math.min(a, b);
		for(int i = 2; i <= min; ++i) {
			if (((a % i) == 0) && ((b % i) == 0)) {
				return i;
			}
		}
		// return 1, when there's no gcd.
		return 1;
	}
}

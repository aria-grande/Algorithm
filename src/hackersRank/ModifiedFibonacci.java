package hackersRank;

import java.math.BigInteger;

public class ModifiedFibonacci {

	 public static String getNthModifiedFib(final int A, final int B, final int N) {
        
		BigInteger[] fibMod = new BigInteger[N];
        fibMod[0] = BigInteger.valueOf(A);
        fibMod[1] = BigInteger.valueOf(B); 
        
        for (int i = 2; i < N; ++i) {
            fibMod[i] = fibMod[i-1].pow(2).add(fibMod[i-2]);
        }
        
        return fibMod[N-1].toString();
    }
}

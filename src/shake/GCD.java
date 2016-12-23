package shake;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GCD {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int k = s.nextInt();
//		System.out.println(getFactorization(n));
//		s.close();
//		
//	}
	
	private static BigInteger getFactorial(int n) {
		BigInteger ret = BigInteger.ONE;
		for(int i = 1; i <= n; ++i) {
			ret = ret.multiply(BigInteger.valueOf(i));
		}
		return ret;
	}

	
	public static int getGcdBruteForce(int n, int k) {
		if(n <= 1 || k == 1)	return 1;
		if(n >= k)	return k;
		
		BigInteger nFactorial = getFactorial(n);
		return nFactorial.gcd(BigInteger.valueOf(k)).intValue();
		
	}
	
	
	// code below is what I thought.
	public static int getGcd(final int n, int k) {
		
		if (n <= 1 || k <= 1)	return 1;
		if (n >= k) return k;
		
		Map<Integer, Integer> fact = getFactorization(k);
		Iterator<Integer> it = fact.keySet().iterator();
		int gcd = 1;
		// approach to each prime
		while(it.hasNext()) {
			int prime = it.next();
			int mul = prime;
			int added;
			int total = 0;
			// get number of multiplication of the prime
			while((added=n/mul) > 0) {
				mul *= prime;
				total += added;
			}
			
			int minMul = Math.min(fact.get(prime), total);
			gcd *= Math.pow(prime, minMul);
		}
		
		return gcd;
	}

	private static Map<Integer, Integer> getFactorization(int n) {
		Map<Integer, Integer> fact = new HashMap<Integer, Integer>();	// <밑, 지수>, ex: 2^2 * 3^4 => <2, 2>, <3, 4> key's list = prime numbers that k have.
		
		for (int primeNum = 2; primeNum <= n; ++primeNum) {
			int cnt = 0;
			while (n % primeNum == 0) {
				n /= primeNum;
				++cnt;
			}
			
			if (cnt != 0) {
				fact.put(primeNum, cnt);
			}
		}
		
		return fact;
		
	}

}

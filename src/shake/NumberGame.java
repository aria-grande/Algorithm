package shake;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		
		while (--testCase >= 0) {
			System.out.println(getMinCommonN(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
		}
	}
	
	private static int findMaxDividerIndex(int[] dividers) {
		int max = Integer.MIN_VALUE;
		int idxOfMax = 0;
		for(int i = 0; i < dividers.length; ++i) {
			if (dividers[i] > max) {
				idxOfMax = i;
				max = dividers[i];
			}
		}
		return idxOfMax;
	}
	
	private static int getMinCommonN(int p1, int p2, int p3, int x1, int x2, int x3) {
		
		final int limit = 1000000000;
		
		int dividers[] = {p1,p2,p3};
		int remainders[] = {x1,x2,x3};
		
		int maxDividerIndex = findMaxDividerIndex(dividers);
		
		int newP2 = dividers[(maxDividerIndex + 1)%3];
		int newP3 = dividers[(maxDividerIndex + 2)%3];
		int newX2 = remainders[(maxDividerIndex + 1)%3];
		int newX3 = remainders[(maxDividerIndex + 2)%3];
		for(int n = remainders[maxDividerIndex]; n < limit; n += dividers[maxDividerIndex]) {
			if (n % newP2 == newX2 && n % newP3 == newX3) {
				return n;
			}
		}
		
		return -1;
		
		
//		int n1 = x1, n2 = x2, n3 = x3;
//		int curMax;
//		
//		while (!(n1 == n2 && n2 == n3) && 
//				((n1 < limit) && (n2 < limit) && (n3 < limit))) {
//			curMax = Math.max(Math.max(n1, n2), n3);
//
//			while (n1 < curMax)	n1 += p1;
//			while (n2 < curMax)	n2 += p2;
//			while (n3 < curMax)	n3 += p3;
//			
//		}
//		
//		System.out.println((n1 < limit && n1 == n2 && n2 == n3) ? n1 : -1);
	}
	
}

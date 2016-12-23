package shake;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
//		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        String[] temp = bfr.readLine().split(" ");
//        
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		
		while (--testCase >= 0) {
			System.out.println(solve(s.nextLong(), s.nextLong()));
		}
	}
	
	
	public static long solve(long s, long n) {
//		System.out.println("s = " +s +", n = " + n);
		if (s < 5)	return 0;
		long cnt = (s / 5);
		long max = ((s + n) / 12);
		
		return (cnt > max) ? max : cnt; 
	}
		
	public static int solve2(long s, long n) {
		
		if (s < 5)	return 0;
		int cnt = 0;
		while (true) {
			if (s < 5 || (s+n) < 12)	break;
			
			if (n >= 7) {
				n -= 7;
				s -= 5;
			}
			else if (s >= 7){
				s -= 12;
			}
			else {
				break;
			}
			
			++cnt;
		}
		
		return cnt;
	}
}

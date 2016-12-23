package shake;

import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		
		while (--testCase >= 0) {
			encrypt(s.next());
		}
	}
	
	private static void encrypt(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		char[] string = str.toCharArray();
		
		for (int even = 0; even < string.length; even += 2) {
			sb.append(string[even]);
		}
		
		for (int odd = 1; odd < string.length; odd += 2) {
			sb.append(string[odd]);
		}
		
		System.out.println(sb.toString());
	}
}

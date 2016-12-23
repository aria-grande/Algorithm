package algospot;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int testCases = s.nextInt();
		while( --testCases >= 0) {
			System.out.println(isAnagram(s.next(), s.next()) ? "Yes" : "No.");
		}
		
		s.close();
	}
	
	public static boolean isAnagram(String s1, String s2) {
				
		// Time Complexity: O(n)
		// Space Complexity : O(1)
		
		final int s1len = s1.length();
		final int s2len = s2.length();

		if ((s1.equals(s2)) || (s1len != s2len) || 
				(s1len > 100) || (s2len > 100)) return false;

		final int alSize = 'z' - '0' + 1;
		int[] al = new int[alSize];

		for (int i = 0; i < s1len; ++i) {
			char tmp1 = s1.charAt(i);
			if (!isValidFormat(tmp1)) {
				return false;
			}
			++al[tmp1 - '0'];
			
			char tmp2 = s2.charAt(i);
			if (!isValidFormat(tmp2)) {
				return false;
			}
			--al[tmp2 - '0'];
		}
		
		for (int k = 0; k < alSize; ++k) {
			if (al[k] != 0)
				return false;
		}
			
		return true;
	}
	
	private static boolean isValidFormat(char c) {
		return (((c >= 'a') && (c <= 'z')) || 
				((c >= 'A') && (c <= 'Z')) || 
				((c >= '0') && (c <= '9'))); 
	}
	
}

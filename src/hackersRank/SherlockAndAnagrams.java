package hackersRank;

import java.util.Scanner;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        while (testCase-- > 0) {
            System.out.println(getNumOfAnagramsAmongSubstrings(s.next()));
        }
    }
	
	public static int getNumOfAnagramsAmongSubstrings(String str) {
		
		int ret = 0;
		int len = str.length();
		
		for (int sp = 0; sp < len; ++sp) {
			for (int ep = sp; ep < len; ++ep) {
				
				String stdStr = str.substring(sp, ep + 1);
				ret += findNumOfAnagram(sp + 1, stdStr, str);
			}
		}
		
		return ret;
	}
	
	private static int findNumOfAnagram(int sp, final String strToFind, final String fullStr) {
		int fullStrLen = fullStr.length();
		int strToFindLen = strToFind.length();
		
		int cnt = 0;
		for (; sp <= fullStrLen-strToFindLen; ++sp) {
			if (isAnagram(strToFind, fullStr.substring(sp, sp + strToFindLen))) {
				++cnt;
			}
		}
		
		return cnt;
	}
	
	private static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null)	return false;
		if (s1.length() != s2.length())	return false;
		
		int len = s1.length();
		int[] alphabets = new int['z'-'a'+1];	// might 42
		
		// for s1
		for (int i = 0; i < len; ++i) {
			++alphabets[s1.charAt(i)-'a'];
		}
		
		// for s2
		for (int i = 0; i < len; ++i) {
			--alphabets[s2.charAt(i)-'a'];
		}
		
		// alphabets should be 0 if s1 and s2 are anagram
		for (int i = 0; i < alphabets.length; ++i) {
			if (alphabets[i] != 0)	return false;
		}
		
		return true;
	}
}

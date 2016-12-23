package hackersRank;

public class TwoStrings {

	public static boolean isSubString(String s1, String s2) {
		if (s1.equals(s2))	return true;
		
		final int s1len = s1.length();
		final int s2len = s2.length();
		
		int[] al1 = new int[26];
		int[] al2 = new int[26];
		
		for (int i = 0; i < s1len; ++i) {
			++al1[s1.charAt(i) - 'a'];
		}
		
		for (int j = 0; j < s2len; ++j) {
			++al2[s2.charAt(j) - 'a'];
		}
		
		for (int k = 0; k < 26; ++k) {
			if (al1[k] != 0 && al2[k] != 0)	
				return true;
		}
		
		return false;
		
		// t.c : 2n, s.c : O(1)
	}
}

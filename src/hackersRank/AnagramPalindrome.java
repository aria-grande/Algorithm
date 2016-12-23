package hackersRank;

public class AnagramPalindrome {

	public static boolean isPalindrome(String s) {
		final int slen = s.length();
		
		if ((s == null) || (slen == 0))	return false;
		if (slen == 1)	return true;
		
		int[] al = new int[26];
		for(int i = 0; i < slen; ++i) {
			++al[s.charAt(i)-'a'];
		}

		int oddCnt = 0;
		for (int j = 0; j < 26; ++j) {
			if ((al[j] % 2) != 0) {
				++oddCnt;
			}
		}

		return (oddCnt >= 1) ? true : false;
	}
}

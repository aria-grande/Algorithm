package hackersRank;

import java.util.Arrays;


public class Gemstones {

	public static int getNumOfGemstones(String[] stones) {
		
		final int slen = stones.length;
		int []al = new int[26];
		
		// remove duplicated letters
		for (int i = 0; i < slen; ++i) {

			char[] chars = stones[i].toCharArray();
			
			Arrays.sort(chars);

			char cur = chars[0];
			for (int j = 1; j < chars.length; ++j) {
			
				char tmp = chars[j];
				if (cur != tmp) {
					++al[cur-'a'];
					cur = tmp;
				}
			}
			
			++al[cur-'a'];
		}
		
		// compare each string
		int cnt = 0;
		
		for (int k = 0; k < 26; ++k) {
			if (al[k] == slen)	++cnt;
		}
		
		return cnt;
	}
}

package hackersRank;

import java.util.Arrays;


public class BiggerIsGreater {
	
	public static String get(String s) {
		
		final String none = "no answer";
		final int slen = s.length();
		
		if (slen == 1)	return none;
		
		char[] val = s.toCharArray();
		for (int i = slen - 2; i >= 0; --i) {
			sort(val, i, (slen - 1));
			String vals = arrToStr(val);
			
			if (compare(vals, s))
				return vals;
		}
		
		return none;
	}
	
	private static void sort(char[] arr, int sp, int ep) {
		
		char[] tmp = Arrays.copyOfRange(arr, sp, ep + 1);
		Arrays.sort(tmp);
		
		int p = -1;
		for(int i = 0; i < tmp.length; ++i) {
			if  (tmp[i] == arr[sp]) {
				p = i;
			}
		}
		
		if ((p == -1) || (p >= (tmp.length - 1)))	return ;
		
		arr[sp] = tmp[p + 1];
		for(int i = sp + 1, j = 0; i <= ep; ++i, ++j) {
			if (j == (p + 1))	++j;
			 
			arr[i] = tmp[j];
		}
			
	}
	
	private static boolean compare(String bigger, String smaller) {

		final int len = bigger.length();

		for (int i = 0; i < len; ++i) {
			char b = bigger.charAt(i);
			char s = smaller.charAt(i);
			
			if (b > s) return true;
			else if (b < s)	return false;
		}
		
		return false;
	}
	
	private static String arrToStr(char[] arr) {
		StringBuilder ret = new StringBuilder();

		for (int i = 0; i < arr.length; ++i) {
			ret.append(arr[i]);
		}
		
		return ret.toString();
	}
}

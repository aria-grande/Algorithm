package hackersRank;

public class AlternatingCharacters {
	
	public static int minNumOfDels(String s) {
		int slen = s.length();
		
		if (slen <= 1) return 0;
		
		int cnt = 0;
		
		char cur = s.charAt(0);
		for (int i = 1; i < slen; ++i) {
			char tmp = s.charAt(i);
			if (cur == tmp)	++cnt;
			else cur = tmp;
		}
		
		return cnt;
	}
}

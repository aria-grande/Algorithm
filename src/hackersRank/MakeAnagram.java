package hackersRank;

public class MakeAnagram {

	public int numberOfOps(String str) {
		
		int len = str.length();
		if (len % 2 != 0)	return -1;
		
		int mid = len / 2;
		String s1 = str.substring(0, mid);
		String s2 = str.substring(mid, len);
		
		int[] counts = new int['z'-'a'+1];
		// for s1
		for (int i = 0; i < s1.length(); ++i) {
			++counts[s1.charAt(i) - 'a'];
		}
		// for s2
		for (int i = 0; i < s2.length(); ++i) {
			--counts[s2.charAt(i) - 'a'];
		}
		
		// count of operations required to make anagram
		int cnt = 0;
		for (int i = 0; i < counts.length; ++i) {
			cnt += Math.abs(counts[i]);
		}
		
		return cnt / 2;
	}
}

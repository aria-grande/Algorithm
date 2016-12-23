package hackersRank;

public class CommonChild {

	public int getMaxLenOfCommonChild(String s1, String s2) {
		
		int s1len = s1.length();
		int s2len = s2.length();
		int[][] lenTable = new int[s1len+1][s2len+1];
		
		for (int i = 0; i < s1len; ++i) {
			for (int j = 0; j < s2len; ++j) {
				lenTable[i+1][j+1] = (s1.charAt(i) == s2.charAt(j)) ? lenTable[i][j] + 1 : Math.max(lenTable[i][j+1], lenTable[i+1][j]);
			}
		}
		
		return lenTable[s1len][s2len];
	}
}

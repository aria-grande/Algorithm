package hackersRank;

public class AngryProfessor {
	
	public String isCancelled(int N, int K, int[] aTimes) {
		int alen = aTimes.length;
		
		// 1. input check
		if ((N < K) || (N < 1) || (K < 1) || (alen != N)) {
			return null;
		}
		
		// 2. count attending students
		int cnt = 0;
		for (int i = 0; i < alen; ++i) {
			if (aTimes[i] <= 0) ++cnt;
		}
		
		return (K > cnt) ? "YES" : "NO";
	}
}

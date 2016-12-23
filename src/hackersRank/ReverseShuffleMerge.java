package hackersRank;

public class ReverseShuffleMerge {

	public String getSmallestString(String str) {
		StringBuilder a = new StringBuilder();
		
		int slen = str.length();
		
		// get what characters consist of the input string
		int[] remained = new int['z'-'a'+1];		
		for (int i = 0; i < slen; ++i) {
			++remained[str.charAt(i)-'a'];
		}
		
		int[] toBeChosen = new int['z'-'a'+1];
		for (int j = 0; j < remained.length; ++j) {
			toBeChosen[j] = remained[j] / 2;
		}
		
		int picked = slen;
		while (a.length() < slen / 2) {
			picked = searchSmallestCharAndPutToA(str, remained, toBeChosen, picked -1 , a);
		}
		
		return a.toString();
	}
	
	public int searchSmallestCharAndPutToA(String s, int[] remained, int[] toBeChosen, int from, StringBuilder a) {
		
		char smallest = (char)('z'+1);
		int smallestIdx = from;
		int to = from;
		
		while (true) {
			char tmp = s.charAt(to);
			int tidx = tmp - 'a';
			
			if (tmp < smallest && toBeChosen[tidx] > 0) {
				smallest = tmp;
				smallestIdx = to;
			}
			
			if (--remained[tidx] < toBeChosen[tidx])	break;
			
			to--;
		}
		
		--toBeChosen[smallest-'a'];
		for (int j = to; j < smallestIdx; ++j) {
			++remained[s.charAt(j)-'a'];
		}
		
		a.append(smallest);
		
		return smallestIdx;
	}
}

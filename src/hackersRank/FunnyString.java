package hackersRank;

public class FunnyString {

	public static boolean isFunny(String s) {
		
		final int len = s.length();
		if (len == 2)	return true;
		
		final int loopCnt = len / 2;
		
		for(int i = 0; i < loopCnt; ++i) {
			
			int val1 = Math.abs(s.charAt(i + 1) - s.charAt(i));
			int val2 = Math.abs(s.charAt(len - i - 1) - s.charAt(len - i - 2));

			if (val1 != val2)	return false;
		}
		
		return true;
	}
}

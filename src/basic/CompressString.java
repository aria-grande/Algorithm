package basic;

public class CompressString {

	public String compress(String s) {
		int slen;
		if ((s == null) || ((slen = s.length()) <= 1))	return s;
		
		StringBuilder ret = new StringBuilder();
		
		char val = s.charAt(0);
		int cnt = 1;
		
		for (int i = 1; i < slen; ++i) {
		
			if (val != s.charAt(i)) {
				ret.append( val + Integer.toString(cnt) );
				val = s.charAt(i);
				cnt = 1;
			}
			
			else {
				++cnt;
			}
		}
		
		ret.append( val + Integer.toString(cnt) );
		
		return (slen < ret.length()) ? s : ret.toString();
	}
}

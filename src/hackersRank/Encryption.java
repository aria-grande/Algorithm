package hackersRank;


public class Encryption {
	// solution 2
	public static void get(String s) {
		
		int slen = s.length();
		if (slen > 81)	return ;
		
		int row = (int) Math.floor(Math.sqrt(slen));
		int col = (row * row >= slen) ? row : row + 1;

		for (int i = 0; i < col; ++i) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < slen; j += col) {
				sb.append(s.charAt(j));
			}
			System.out.println(sb.toString());
		}
	}
	
	
	// solution 1
	public static void solve(String s) {
		int slen = s.length();
		if (slen > 81) {
			return ;
		}
		
		final double rtL = Math.sqrt(slen);
		final int f_rtL = (int) Math.floor(rtL);
		final int c_rtL = (int) Math.ceil(rtL);
		
		// get row and col
		int row = 0;
		int col = 0;
		for (row = f_rtL; row <= c_rtL; ++row) {
			col = (int) Math.ceil(slen / row);
			if (col - row <= 1) {
				break;
			}
		}
		
		// print
		for (int i = 0; i < col; ++i) {
			for (int j = 0; j < row; ++j) {
				System.out.print(s.charAt(j * col + i));
			}
			
			System.out.print(" ");
		}
		System.out.println("");
	}
}

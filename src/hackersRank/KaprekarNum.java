package hackersRank;

import java.util.Scanner;

public class KaprekarNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		getKaprekarNums(s.nextInt(), s.nextInt());
		
		s.close();
	}
	
	/**
	 * 
	 * @param p 0<p<100000
	 * @param q 0<q<100000
	 * @return List<Integer> list of kaperkar numbers
	 */
	public static String getKaprekarNums(int p, int q) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = p; i <= q; ++i) {
			// store i^2 as String
			String val_s = Long.toString((long) Math.pow(i, 2));
			// get length of i^2
			int id = val_s.length() / 2;
			
			// divide val as left and right parts
			int left, right;
			if (id == 0) {
				left = 0;
			}
			else {
				left = Integer.parseInt(val_s.substring(0, id));	
			}
			right = Integer.parseInt(val_s.substring(id));
			
			if (i == (left + right)) {
				sb.append(" " + Integer.toString(i));
			}
		}
		
		return sb.toString().trim();
	}
}

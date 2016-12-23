package basic;

import java.util.Scanner;

public class atoi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String val = s.next();

		System.out.println(atoi(val));
		System.out.println("itoa = " + itoa(Integer.parseInt(val)));
		s.close();
	}
	
	private static String itoa(int val) {
		String ret = "";
		boolean negative = false;
		if (val < 0) {
			negative = true;
			val = -val;
		}
		
		while(val > 0) {
			ret = (char) ('0' + val % 10) + ret;
			val /= 10;
		}
		
		return negative ? "-" + ret : ret;
	}
	
	private static int atoi(String val) {
		long ret = 0;
		boolean negative = false;
		int	len = val.length();
		for (int i = 0; i < len; ++i) {
			char tmp = val.charAt(i);
			if (tmp == '-') {
				negative = true;
				continue;
			}
			if (tmp >= 'A') {
				return (tmp - 'A');
			}
			if (tmp >= '0') {
				ret = ret * 10 + (tmp - '0');
			}
			
		}
		
		if ((ret > 2147483647) || (ret < -2147483648)) {
			throw new NumberFormatException("input is not integer");
		}
		

		return negative ? (int) -ret : (int) ret;
	}
}

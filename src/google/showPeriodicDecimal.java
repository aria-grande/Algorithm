package google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class showPeriodicDecimal {
	public static String div(int n, int m) {
		final int logM = (int) Math.ceil(Math.log(m));
		StringBuilder ret = new StringBuilder();
		
		int div = 0;
		if (n == m) {
			return "1.(0)";
		}
		else if (n > m) {
			div = n / m;
		}
		// Hash 로
		Map<Integer, Integer> path = new HashMap<Integer, Integer>(); 
		List<Integer> fraction = new ArrayList<Integer>();
		List<Integer> divs = new ArrayList<Integer>();
		int idx = -1;
		
		while (n % m != 0) {
			n *= (10 * logM);
			if ((idx = divs.indexOf(n)) == -1) {
				divs.add(n);
			}
			else {
				break;
			}
			
			int div_tmp = n / m;
			if ((div_tmp) > 0) {
				fraction.add(div_tmp);
				n -= (n * div_tmp);
			}
		}
		
		int fracSize = fraction.size();
		
		ret.append(div + ".");
		
		for (int i = 0; i < fracSize; ++i) {
			
		}
		
		if (true) {
			ret.append("(0)");
		}
		
		return ret.toString();
	}
}

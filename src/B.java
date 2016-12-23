
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		
		while(--testCases >= 0) {
			List<String> beers = new ArrayList<String>();
			int beerSize = s.nextInt();
			int knowSize = s.nextInt();
			
			for (int i = 0; i < beerSize; ++i) {
				beers.add(s.next());
			}
			
			int[] index = new int[knowSize];
			String[] strs = new String[knowSize];
		
			for (int j = 0; j < knowSize; ++j) {
				index[j] = s.nextInt();
				strs[j] = s.next();
			}
			
			System.out.println(getBeerName(beers, index, strs));
			
		}
	}
	public static String getBeerName(List<String> beers, int[] idx, String[] str) {
		if (idx.length == 0)	return "YOU KNOW NOTHING";
		List<String> retBeers = new ArrayList<String>();
		
		// beer
		for (int i = 0; i < beers.size(); ++i) {
			String beer = beers.get(i);
			
			// every condition
			boolean satisfied = true;	// and rel
			for (int j = 0; j < idx.length; ++j) {
				int pos = idx[j] - 1;
				String condt = str[j];
				if (pos > beer.length() - 1) {
					satisfied = false;
					break;
				}
				
				boolean or = false;
				for (int k = 0; k < condt.length(); ++k) {
					if (beer.charAt(pos) == condt.charAt(k)) {
						or = true;
						break;
					}
				}
				
				if (or == false) {
					satisfied = false;
					break;
				}
			}
			
			if (satisfied == true) {
				retBeers.add(beer);
			}
		}
		
		int bs = retBeers.size();
		if (bs == 0)	return "DEAD DRUNK";
		if (bs > 1)	return "YOU KNOW NOTHING";
		
		return retBeers.get(0);
	}
}

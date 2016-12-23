import java.util.Arrays;


public class PascalTriangle {

	public static void get(int height) {
		double st = System.currentTimeMillis();
		
		long[] oldVals = new long[25];
		long[] newVals = new long[25];
		
		if (height <= 0)	return ;
		
		if (height >= 1) {
			System.out.println("1");
		}
		
		if (height >= 2) {
			oldVals[0] = 1;
			oldVals[1] = 1;
			
			System.out.println("1 1");
		}
		
		newVals[0] = 1;
		
		for (int i = 3; i <= height; ++i) {
			
			StringBuilder ret = new StringBuilder("1 ");
			
			int j;
			int border = (i + 1) / 2;
			for (j = 1; j < border; ++j) {
				if ((j == (border - 1)) && ((i & 1) == 1)) {
					newVals[j] = 2 * oldVals[j-1];
				}
				else {
					newVals[j] = oldVals[j-1] + oldVals[j];
				}
				
				ret.append(newVals[j] + " ");
			}
			
			for (int k = i/2 - 1; k >= 0; --k) {
				ret.append(newVals[k] + " ");
			}
			
			System.out.println(ret.toString().trim());
			oldVals = Arrays.copyOf(newVals, 25);
		}
		
		double et = System.currentTimeMillis();
		System.out.println("duration: " + ((et - st) / 1000) + " sec");
		
	}
}

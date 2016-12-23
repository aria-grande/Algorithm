import java.util.Stack;


public class BracesOrder {

	/*
	 *  S.C: 2n
	 *  T.C: 2n
	 */
	public static void get(String input) {
		if (!input.matches("^[\\(\\)]+$"))	return ;
		
		int len = input.length();
		int order = 1;
		
		int[] orders = new int[len];
		Stack<Integer> openB = new Stack<Integer>();
		
		for(int i = 0; i < len; ++i) {
			
			char tmp = input.charAt(i);
			if ('(' == tmp) {
				openB.push(i);
			}
			
			else if (')' == tmp) {

				if (openB.isEmpty()) {
					System.out.println("WRONG  EXPRESSION");
					return ;
				}
				
				orders[openB.pop()] = order;
				orders[i] = order;
				
				++order;
			}
		}
		
		// if openB is not empty, print wrong expression.
		if (!openB.isEmpty()) {
			System.out.println("WRONG  EXPRESSION");
		}
		
		else {
			
			StringBuilder ret = new StringBuilder();
			
			for (int j = 0; j < len; ++j) {
				ret.append(orders[j] + " ");
			}
			
			System.out.println(ret.toString().trim());
		}
	}
}

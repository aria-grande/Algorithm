package basic;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

	public static int get(String[] s) throws Exception {
		
		Stack<String> operator = new Stack<String>();
		Stack<Integer> operand = new Stack<Integer>();

		for(int i = 0; i < s.length; ++i) {
			String tmp = s[i];
			int tmp_i;
			
			if ("(".equals(tmp) || "+".equals(tmp) || "-".equals(tmp) || "/".equals(tmp) || "*".equals(tmp)) {
				operator.push(tmp);
			}
			
			else if (")".equals(tmp)) {
				while (true) {
					try {
						String opr = operator.pop();
						if ("(".equals(opr)) {
							break;
						}
						
						int op1 = operand.pop();
						int op2 = operand.pop();
						System.out.println("op1 = " + op1+ ", op2 = " + op2 + ", operator = " + opr);

						operand.push(basicCal(op1, op2, opr));
						
					} catch(EmptyStackException e) {
						System.err.println("Input is weird");
						return -1;
					}
				}
			}
			
			else {
				tmp_i = Integer.parseInt(tmp);
				operand.push(tmp_i);
			}
			
		}
		
		while (operator.size() > 0) {

			try {
				String opr = operator.pop();
				int op1 = operand.pop();
				int op2 = operand.pop();
				System.out.println("op1 = " + op1+ ", op2 = " + op2 + ", operator = " + opr);
				
				operand.push(basicCal(op1, op2, opr));
				
			} catch(EmptyStackException e) {
				System.err.println("Input is weird");
				return -1;
			}
		}
		
		if (operand.size() != 1 || operator.size() != 0) {
			System.err.print("error! operand.size() = " + operand.size() + ", operator.size() = " + operator.size());
			return -1;
		}
		else {
			return operand.pop();
		}
	}
	
	public static int basicCal(int op1, int op2, String opr) {
		if ("+".equals(opr)) {
			return op2 + op1;
		}
		else if ("-".equals(opr)) {
			return op2 - op1;
		}
		else if ("*".equals(opr)) {
			return op2 * op1;
		}
		else if ("/".equals(opr)) {
			return op2 / op1;
		}
		
		return -1;
	}
}

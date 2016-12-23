package basic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() throws Exception {
		String[] s = { "(", "(", "1", "+", "2", ")", "*", "(", "3", "+", "4", ")", ")", "+", "5" };
		assertTrue(26 == Calculator.get(s));
		
		String[] s2 = { "(", "(", "1", "+", "2", ")", "*", "(", "3", "+", "4", ")", ")", "+", "5", "*", "2" };
		assertTrue(31 == Calculator.get(s2));
		
		String[] s3 = { "(", "(", "1", "+", "2", ")", "*", "(", "3", "+", "4", ")", ")", "+", "5", "*", "2" , "*", "(", "1", "+", "2", ")"};
		assertTrue(51 == Calculator.get(s2));
	}
	
//	@Test(expected=Exception.class)
	@Test
	public void InputIsNotClosed() throws Exception {
		String[] s = { "(", "(", "(", "1", "+", "2", ")", "*", "(", "3", "+", "4", ")", ")", "+", "5" };
		assertTrue(-1 == Calculator.get(s));
	}
}

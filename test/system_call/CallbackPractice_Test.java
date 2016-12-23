package system_call;

import org.junit.Test;

public class CallbackPractice_Test {
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void run() {
		CallbackPractice cp = new CallbackPractice();
		CallbackPractice.MaxNumIsExceed callback = new CallbackPractice.MaxNumIsExceed() {
			
			@Override
			public void setMaxNumCb(int num, int exceed) {
				System.out.println(num + " is exceed to " + exceed);
				
			}
		};
		
		cp.setMaxNum(10);
		cp.setMaxNumIsExceed(callback);
		for (int i = 1; i <= 10; ++i) {
			cp.addNumber(i);
		}
	}
}

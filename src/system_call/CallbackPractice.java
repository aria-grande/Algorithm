package system_call;

public class CallbackPractice {
	interface MaxNumIsExceed {
		void setMaxNumCb(int num, int exceed);
	}
	
	private MaxNumIsExceed cb;
	private int maxNum = 0;
	private int sum = 0;
	
	public void setMaxNumIsExceed(MaxNumIsExceed m) {
		cb = m;
	}
	
	public void setMaxNum(int maxNum) {	
		this.maxNum = maxNum;
	}
	
	public void addNumber(int num) {
		sum += num;
		
		if ((cb != null) && (sum > maxNum)) {
			cb.setMaxNumCb(sum, (sum - maxNum));
		}
	}
	
	public int getTotal() {
		return sum;
	}
	
}

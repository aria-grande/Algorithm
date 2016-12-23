package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
        long ret = 0;
        while (x > 0) {
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        
        return isInt(ret) ? (int) ret : 1;
    }
	
	public boolean isInt(long x){
		return Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE;
	}
}

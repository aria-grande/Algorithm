package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	public static String getRange(int startVal, int startP, int endVal, int endP) {

		if (startP == endP)	return String.valueOf(startVal);
    	
    	return startVal + "->" + endVal;
	}
	
	public static List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<String>();
        
        int nlen;
        if (nums == null || (nlen=nums.length) == 0) {
        	return ret;
        }
        
        int sp = nums[0];	// value of start point
        int si = 0;			// index of start point
        for (int i = 1; i < nlen; ++i) {
        	int cur = nums[i];
        	if ((cur - sp) == (i - si)) {
        		continue;
        	}

        	ret.add(getRange(sp, si, nums[i-1], i-1));
        	
        	sp = cur;
        	si = i;
        }
        
        ret.add(getRange(sp, si, nums[nlen-1], nlen-1));
        
        return ret;
    }
}

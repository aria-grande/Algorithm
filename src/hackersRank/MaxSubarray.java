package hackersRank;

import java.util.Arrays;

public class MaxSubarray {
	
	public static int[] get(int[] arr) {
		
		int maxAcc_non = 0;
		
		int maxSp = 0, maxEp = 0, maxAcc = 0, maxVal = arr[0];
		int curSp = 0, curEp = 0, curMax = 0;
		
		for ( ; curEp < arr.length; ++curEp) {
			int val = arr[curEp];
			// non-contiguous
			if (val > 0)	maxAcc_non += val;
			
			// contiguous
			curMax += val;
			if (curMax > maxAcc) {
				maxAcc = curMax;
				maxEp = curEp;
			}
			
			if (curMax < 0) {
				curSp = (curEp + 1);
				curMax = 0;
			}
			
			if (maxVal < val) {
				maxVal = val;
			}
		}
		
		// con, non-con
		return (maxAcc == 0) ? new int[]{ maxVal, maxVal } : new int[]{ maxAcc, maxAcc_non };
	}
	
	public static int getContiguous(int[] arr) {
		int maxSp = 0, maxEp = 0, maxAcc = 0, maxVal = arr[0];
		int curSp = 0, curEp = 0, curMax = 0;
		
		for ( ; curEp < arr.length; ++curEp) {
			int val = arr[curEp];
			curMax += val;
			if (curMax > maxAcc) {
				maxAcc = curMax;
				maxEp = curEp;
			}
			
			if (curMax < 0) {
				curSp = (curEp + 1);
				curMax = 0;
			}
			
			if (maxVal < val) {
				maxVal = val;
			}
		}
		
		return (maxAcc == 0) ? maxVal : maxAcc;
		
	}

	public static int getNonContiguous(int[] arr) {
		
		int ret = 0;
		int last = arr.length - 1;
		Arrays.sort(arr);
		
		for (int i = last; i >= 0; --i) {
			int tmp = arr[i];

			if (tmp <= 0)	break;
			
			ret += tmp;
		}
		
		return (ret == 0) ? arr[last] : ret;
	}
}

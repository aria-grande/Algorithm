package leetcode;

import java.util.Arrays;

public class ContainsDuplicate {

	public static boolean judge(int[] arr) {
		int alen;
		if (arr != null && (alen = arr.length) != 0) {
			Arrays.sort(arr);
			
			int ex = arr[0];
			for (int i = 1; i < alen; ++i) {
				int cur = arr[i];
				if (ex == cur)	return true;
				else	ex = cur;
			}
		}
		return false;
	}
}

package leetcode;

import java.util.LinkedList;

public class Intersection_of_two_linkedList {
	public Object findIntersection(LinkedList a, LinkedList b) {
		if ((a == null) || (b == null)) {
			return null;
		}
		
		int a_size = a.size();
		int b_size = b.size();
		if ((a_size == 0) || (b_size == 0)) {
			return null;
		}
		
		int big_size = a_size;
		int small_size = b_size;
		if (a_size < b_size) {
			big_size = b_size;
			small_size = a_size;
		}
		
		int cnt = 0;
		for (int i = 1; i <= big_size; ++i) {
			if (!a.get(a_size - i).equals(b.get(b_size - i))) {
				if ( i == 1 ) {
					return null;
				}
				else {
					return a.get(a_size - i + 1);
				}
			}
			else {
				++cnt;
			}
		}
		
		if (cnt == small_size) {
			return a.get(0);
		}
		
		return null;
	}
}

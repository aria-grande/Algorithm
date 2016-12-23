package leetcode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SummaryRangesTest {

	@Test
	public void empty_array() {
		int[] a = {};
		String[] ans = {};
		
		assertEquals(0, SummaryRanges.summaryRanges(a).size());
		
	}
	
	@Test
	public void array_size_is_one() {
		int[] a = {2};
		String[] ans = {"2"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
	}
	
	@Test
	public void array_size_is_two() {
		int[] a = {0, 1};
		String[] ans = {"0->1"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
		
	}
	
	@Test
	public void array_size_is_two_2() {
		
		int[] a = {1, 3};
		String[] ans = {"1", "3"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
	}
	
	@Test
	public void end_point_is_solo() {
		int[] a = {1,2,3, 5,6, 8};
		String[] ans = {"1->3", "5->6", "8"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
	}
	
	@Test
	public void end_point_is_not_solo() {
		int[] a = {1,2, 4, 7,8};
		String[] ans = {"1->2", "4", "7->8"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
	}
	
	@Test
	public void start_point_is_solo() {
		int[] a = {1, 3, 6,7};
		String[] ans = {"1", "3", "6->7"};
		
		List<String> ret = SummaryRanges.summaryRanges(a);
		
		for (int i = 0; i < ret.size(); ++i) {
			assertEquals(ans[i], ret.get(i));
		}
	}
}

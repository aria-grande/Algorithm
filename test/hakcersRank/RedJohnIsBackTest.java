package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.RedJohnIsBack;

import org.junit.Test;

public class RedJohnIsBackTest {

	RedJohnIsBack r = new RedJohnIsBack();
	
	@Test
	public void NIsOddNumAndLargerThan4(){
		
		int[] ns  = {5, 7, 9, 11};
		int[] ans = {2, 3, 4, 8}; 
				
		for (int i = 0; i < ns.length; ++i) {
			assertEquals(ans[i], r.solve(ns[i]));
		}
	}
	
	@Test
	public void NIseEvenNumAndLargerThan4(){
		int[] ns  = {6, 10};
		int[] ans = {2, 6}; 
				
		for (int i = 0; i < ns.length; ++i) {
			assertEquals(ans[i], r.solve(ns[i]));
		}
	}
	
	@Test
	public void NIsDoubleOf4() {
		int[] ns = {4, 8};
		int[] ans = {1, 4};
		
		for (int i = 0; i < ns.length; ++i) {
			assertEquals(ans[i], r.solve(ns[i]));
		}
	}
	
	@Test
	public void NIsSmallerThan4() {
		int[] ns = {1, 2, 3};
		int[] ans = {0, 0, 0};
		
		for (int i = 0; i < ns.length; ++i) {
			assertEquals(ans[i], r.solve(ns[i]));
		}
	}
	
	
}

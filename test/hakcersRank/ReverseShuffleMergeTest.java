package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.ReverseShuffleMerge;

import org.junit.Ignore;
import org.junit.Test;

public class ReverseShuffleMergeTest {

	ReverseShuffleMerge rsm = new ReverseShuffleMerge();
	
	@Test
//	@Ignore
	public void test() {
		String s = "eggegg";
		assertEquals("egg", rsm.getSmallestString(s));
		
		assertEquals("abc", rsm.getSmallestString("abcbca"));
	}
	
	@Test
//	@Ignore
	public void inputIsConsistOfSameChar() {
		String s = "aaaaaaaa";
		assertEquals("aaaa", rsm.getSmallestString(s));
	}
	
	@Test
//	@Ignore
	public void ThereIsNoCharToChooseInRange() {
		String s = "abaaabcacbabaa";
		assertEquals("aaaacbb", rsm.getSmallestString(s));
	}
	
	@Test
//	@Ignore
	public void test2() {
		String s = "bdabaceadaedaaaeaecdeadababdbeaeeacacaba";
		assertEquals("aaaaaabaaceededecbdb", rsm.getSmallestString(s));
	}
}

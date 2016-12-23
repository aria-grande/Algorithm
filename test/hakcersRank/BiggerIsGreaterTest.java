package hakcersRank;

import static org.junit.Assert.assertEquals;
import hackersRank.BiggerIsGreater;

import org.junit.Ignore;
import org.junit.Test;

public class BiggerIsGreaterTest {
	final String none = "no answer";

	@Test
	@Ignore
	public void singleChar() {
		assertEquals(none, BiggerIsGreater.get("a"));
	}
	
	@Test
	@Ignore
	public void sameChars() {
		assertEquals(none, BiggerIsGreater.get("aaa"));
	}
	
	@Test
	public void test() {
		assertEquals("hegf", BiggerIsGreater.get("hefg"));
		assertEquals("dhkc", BiggerIsGreater.get("dhck"));
		assertEquals("hcdk", BiggerIsGreater.get("dkhc"));
		assertEquals("chkad", BiggerIsGreater.get("chdka"));
		assertEquals("chkd", BiggerIsGreater.get("chdk"));
		assertEquals("baach", BiggerIsGreater.get("ahcba"));
	}
}

package basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompressStringTest {

	CompressString cs = new CompressString();
	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	public void InputIsNull() {
		assertNull(cs.compress(null));
	}
	
	@Test
	public void InputIsEmpty() {
		assertEquals("", cs.compress(""));
	}
	
	@Test
	public void InputIsNotCompressed() {
		assertEquals("a", cs.compress("a"));
		assertEquals("ababa", cs.compress("ababa"));
	}
	
	@Test
	public void InputIsCompressed() {
		assertEquals("a2", cs.compress("aa"));
		assertEquals("a3", cs.compress("aaa"));
		assertEquals("a3b1", cs.compress("aaab"));
		assertEquals("a2b3a2", cs.compress("aabbbaa"));
	}
}

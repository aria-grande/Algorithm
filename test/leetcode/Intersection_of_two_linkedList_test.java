package leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Intersection_of_two_linkedList_test {

	Intersection_of_two_linkedList s = new Intersection_of_two_linkedList();
	
	@Test
	public void empty() {
		// empty
	}
	
	@Test
	public void inputIsNull() {
		assertNull(s.findIntersection(null, null));
	}
	
	@Test
	public void inputSizeIsZero() {
		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();
		
		assertNull(s.findIntersection(a, b));
	}
	
	@Test
	public void noIntersection() {
		// same size
		LinkedList<String> a = new LinkedList<String>(Arrays.asList("a1", "a2"));
		LinkedList<String> b = new LinkedList<String>(Arrays.asList("b1", "b2"));
		
		assertNull(s.findIntersection(a, b));
		
		
		// different size
		LinkedList<String> c = new LinkedList<String>(Arrays.asList("c1"));
		
		assertNull(s.findIntersection(a, c));
	}
	
	@Test
	public void intesection() {
		// same size
		LinkedList<String> a = new LinkedList<String>(Arrays.asList("a1", "a2", "c1"));
		LinkedList<String> b = new LinkedList<String>(Arrays.asList("b1", "b2", "c1"));
		
		assertEquals("c1", s.findIntersection(a, b));
		
		
		// different size
		LinkedList<String> d = new LinkedList<String>(Arrays.asList("b1", "b2", "b3", "c1"));
		
		assertEquals("c1", s.findIntersection(a, d));
	}
	
	@Test
	public void intersection2() {
		LinkedList<String> a = new LinkedList<String>(Arrays.asList("a1", "a2", "c1", "c2", "c3"));
		LinkedList<String> b = new LinkedList<String>(Arrays.asList("b1", "b2", "b3", "c1", "c2", "c3"));
		
		assertEquals("c1", s.findIntersection(a, b));
	}
	
}


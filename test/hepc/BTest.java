package hepc;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BTest {

	@Test
	public void test() {
		
		List<String> beers = new ArrayList<String>();
		beers.add("FAILLAGER");
		beers.add("SCHRODINGER");
		beers.add("ROGARDEN");
		
		int[] index = {1, 3, 11};
		String[] strs = {"FS", "IHG", "R"};
		
		assertEquals("SCHRODINGER", B.getBeerName(beers, index, strs));
	}
	
	@Test
	public void test2() {
		
		List<String> beers = new ArrayList<String>();
		beers.add("F");
		beers.add("S");
		beers.add("R");
		
		int[] index = new int[0];
		String[] strs = new String[0];
		
		assertEquals("YOU KNOW NOTHING", B.getBeerName(beers, index, strs));
	}
}

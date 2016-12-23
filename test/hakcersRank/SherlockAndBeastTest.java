package hakcersRank;

import hackersRank.SherlockAndBeast;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class SherlockAndBeastTest {
	
	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void largeInput() {
		SherlockAndBeast.solve();
	}
	
	@Test
	public void test() {
		Scanner s = new Scanner(System.in);
		System.out.println("a = " + s.next());
		System.out.println("b = " + s.next());
		System.out.println("c = " + s.next());
	}
}

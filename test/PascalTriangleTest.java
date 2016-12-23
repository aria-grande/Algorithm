import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import etc.PascalTriangle;


public class PascalTriangleTest {

	@Before
	public void before() {
		System.out.println("-----");
	}
	
	@Test
	public void empty() {
		// do nothing
	}
	
	// 1<= H <= 50
	@Test
	@Ignore
	public void heightIsOne() {
		PascalTriangle.get(1);
	}
	
	@Test
	@Ignore
	public void heightIsTwo() {
		PascalTriangle.get(2);
	}
	
	@Test
	@Ignore
	public void heightIsThree() {
		PascalTriangle.get(3);
	}
	
	@Test
	@Ignore
	public void heightIsFour() {
		PascalTriangle.get(4);
	}
	
	@Test
	@Ignore
	public void heightIsFive() {
		PascalTriangle.get(5);
	}
	
	@Test
	@Ignore
	public void heightIsSix() {
		PascalTriangle.get(6);
	}
	
	@Test
	public void heightIsMax() {
		PascalTriangle.get(50);
	}
}

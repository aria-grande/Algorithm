package google_codejam;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class Google_codejam_2011_A_test {
	
	Google_codejam_2011_A g = new Google_codejam_2011_A();
	ArrayList<String[]> list;
	
	@Test
	public void test() {
		// empty
	}
	
	@Test
	@Ignore
	public void moveRobotB() {
		list = new ArrayList<String[]>() {
			{
				add(new String[] {"B","2"});
				add(new String[] {"B","1"});
			}
		};
		
		assertEquals(4, g.solution(list));
	}
	
	@Test
	@Ignore
	public void moveRobotO() {
		list = new ArrayList<String[]>() {
			{
				add(new String[] {"O","2"});
				add(new String[] {"O","4"});
			}
		};
		
		assertEquals(5, g.solution(list));
	}
	
	@Test
	public void moveRobotBandO() {
		list = new ArrayList<String[]>() {
			{
				add(new String[] {"O","2"});
				add(new String[] {"B","1"});
				add(new String[] {"B","2"});
				add(new String[] {"O","4"});
			}
		};
		// assertEquals(6, g.solution(list));
	}
	
	@Test
	public void noMove() {
		
	}

}

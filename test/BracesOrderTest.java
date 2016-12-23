import org.junit.Ignore;
import org.junit.Test;


public class BracesOrderTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
	@Ignore
	public void inputIsInvalid() {
		BracesOrder.get("dd");
		BracesOrder.get("(dd");
		BracesOrder.get("()");
		BracesOrder.get("( )");
	}
	
	@Test
	public void numOfBracesIsNotSame() {
		BracesOrder.get("(()");
		BracesOrder.get("(()))");
	}

	@Test
	public void orderIsWierd() {
		BracesOrder.get(")((");
	}
	
	@Test
	public void numOfBracesIsSame() {
		BracesOrder.get("(()())");
		BracesOrder.get("(()())(())");
		BracesOrder.get("(()())((()(())))");
	}
	
	@Test
	public void inputIsMaxTest() {
		double st = System.currentTimeMillis();
		
		BracesOrder.get("(()())((()(())))(()())((()(())))(()())((()(())))()(()())((()(())))(()())((()(())))(()())((()(())))()");
		
		double et = System.currentTimeMillis();
		System.out.println("duration: " + ((et - st) / 1000) + " sec");
	}
}

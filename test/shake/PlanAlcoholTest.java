package shake;

import org.junit.Test;

public class PlanAlcoholTest {

	@Test
	public void test1() {
		final int limit = 100;
		int[] plans = new int[limit];
		boolean[] chosed = new boolean[limit];
		
		for (int i = 0; i < limit; ++i) {
			plans[i] = i + 1;
		}
		
		
		long st = System.currentTimeMillis();
		PlanAlcohol p = new PlanAlcohol(plans, chosed);
		System.out.println(p.solve());
		System.out.println("time = " + (System.currentTimeMillis() - st));
	}
}

package algospot;

import org.junit.Ignore;
import org.junit.Test;

public class AncientDictTest {

	@Test
	public void empty() {
		// do nothing
	}
	
	@Test
//	@Ignore
	public void test() {
		String[] inputs = {"gg", "kia", "lotte", "lg", "hanhwa"};
//		String[] inputs = {"dictionary", "english", "is", "ordered", "ordinary", "this"};
		AncientDict.getDictOrder(inputs);
		
//		String[] inputs2 = {"gg", "lg", "lottee"};
//		AncientDict.getDictOrder(inputs2);
	}
	
	@Test
	@Ignore
	public void InvalidHypothesisTest() {
		String[] i = {"ba", "aa", "ab"};
		AncientDict.getDictOrder(i);
		
	}
	
}


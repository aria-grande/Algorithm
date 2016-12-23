package basic;

import org.junit.Ignore;
import org.junit.Test;

public class RmvDuplicateNodesTest {

	@Test
	@Ignore
	public void duplicateNodesTest() {
		Node n5 = new Node(1, null);
		Node n4 = new Node(2, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node header = new Node(1, n2);

		
		RmvDuplicateNodes rm = new RmvDuplicateNodes();
		
		rm.printLinkedList(header);
		Node newHeader = rm.removeDuplicate(header);
		rm.printLinkedList(newHeader);
	}
	
	@Test
	public void AllNodesAreduplicateTest() {
		Node n2 = new Node(1, null);
		Node header = new Node(1, n2);

		
		RmvDuplicateNodes rm = new RmvDuplicateNodes();
		
		rm.printLinkedList(header);
		Node newHeader = rm.removeDuplicate(header);
		rm.printLinkedList(newHeader);
	}
}

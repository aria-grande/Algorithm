package basic;


public class RmvDuplicateNodes {

	public Node removeDuplicate(Node n) {
		Node header = n;
		
		while (n != null) {
			Node second = n.next;
			Node prev = second;
			while(second != null) {
//				if 
//				prev = second;
				second = second.next;
			}
			
			n = n.next;
		}
		
		return header;
		
		
	}
	
	public void removeNextNode(Node node) {
		if (node.next.next != null) {
			node.next = node.next.next;
		}
		else {
			node.next = null;
		}
	}
	
	public void printLinkedList(Node n) {
		while (n != null) {
			System.out.print(n.val + " -> ");
			n = n.next;
		}
		
		System.out.println();
	}
}

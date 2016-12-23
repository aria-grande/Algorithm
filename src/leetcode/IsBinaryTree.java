package leetcode;

import java.util.Stack;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class IsBinaryTree {
	
	// left stack
	Stack<Integer> left_stack = new Stack<Integer>();
	
	// right stack
	Stack<Integer> right_stack = new Stack<Integer>();
	
	public boolean isValidBST(TreeNode root) {

		// consider about termination condition of this function
		if (root == null) return true;
		
		int curVal = root.val;

		// compare current node value is smaller than left_stack.top() 
		// and larger than right_stack.top()
		// return true if satisfies, otherwise return false
		if (((!left_stack.isEmpty()) && (left_stack.peek() <= curVal))
				|| ((!right_stack.isEmpty()) && (right_stack.peek() >= curVal))) {
			return false;
		}

		
		boolean leftRes, rightRes;

		// push parent node value to left stack, when left sub-tree is called
		left_stack.push(curVal);
		leftRes = isValidBST(root.left);
		left_stack.pop();
		
		// push parent node value to right stack, when right sub-tree is called
		right_stack.push(curVal);
		rightRes = isValidBST(root.right);
		right_stack.pop();
		
		return leftRes && rightRes;
		
    }
	
}

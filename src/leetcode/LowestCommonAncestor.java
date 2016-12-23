package leetcode;

public class LowestCommonAncestor {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while (node != null) {
            if (node == p)  return p;
            if (node == q)  return q;
            
            int nodeVal = node.val;
            int pVal = p.val;
            int qVal = q.val;
            
            if (nodeVal < pVal && nodeVal < qVal)   node = node.left;
            else if (nodeVal > pVal && nodeVal > qVal)  node = node.right;
            else    return node;
        }
        
        return root;
    }
}

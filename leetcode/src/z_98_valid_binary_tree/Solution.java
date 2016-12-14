package z_98_valid_binary_tree;

import z_102_Binary_Tree_Level_Order_Traversal.TreeNode;

public class Solution {
	public boolean isValidBST(TreeNode root) {
		
		
		if(root == null || (root.left == null && root.right == null)) return true;
		
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

	public boolean helper(TreeNode root, long max, long min) {
		if(root == null) return true;
		if(root.left.val >= root.val || root.right.val <= root.val) return false;
		
		
		return helper(root.left, root.val, min ) && helper(root.right, max, root.val);
	}

}

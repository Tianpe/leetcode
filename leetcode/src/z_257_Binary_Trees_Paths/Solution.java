package z_257_Binary_Trees_Paths;

import java.util.ArrayList;
import java.util.List;

import z_102_Binary_Tree_Level_Order_Traversal.TreeNode;

public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        helper(result, root, "");
        return result;
    }

	public void helper(List<String> result, TreeNode root, String string) {
		if(root == null) return;
		if(root.left == null && root.right == null){
			string = string + root.val;
			result.add(string);
		}
		if(root.left != null){
			helper(result, root.left, root.val+"->");
		}
		if(root.right != null){
			helper(result, root.right, root.val+"->");
		}
		
	}
}

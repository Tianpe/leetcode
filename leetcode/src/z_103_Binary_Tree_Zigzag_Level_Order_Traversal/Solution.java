package z_103_Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null) return result;
		helper(result, root, 0);
		return result;
        
    }
	
	public void helper(List<List<Integer>> res, TreeNode node, int level){
		if(node == null) return;
		if(res.size() <= level){
			List<Integer> sol = new LinkedList<Integer>();
			res.add(sol);
		}
		if(level%2 == 0) {res.get(level).add(node.val);}
		else{res.get(level).add(0, node.val);}
		
		helper(res, node.left, level+1);
		helper(res, node.right, level+1);		
	}
}

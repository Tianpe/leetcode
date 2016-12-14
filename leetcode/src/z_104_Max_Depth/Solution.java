package z_104_Max_Depth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int maxDepth(TreeNode root) {
        int level = 0;
        if(root == null) return level;
        if(root.left == null && root.right == null) return 1;
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
        	LinkedList<Integer> sol = new LinkedList();
        	int size = queue.size();
        	for(int i = 0; i < size; i++){
        		if(queue.peek().left != null) queue.add(queue.peek().left);
        		if(queue.peek().right != null) queue.add(queue.peek().right);
        		queue.poll();
        	}
        	res.add(sol);
        }
        
        
        return res.size();
        
     }
    
   
}
package z_102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new LinkedList<List<Integer>>();
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       
       if(root == null) return result;
       
       queue.add(root);
       while(!queue.isEmpty()){
    	   int len = queue.size();
    	   List<Integer> sub = new LinkedList<Integer>();
    	   
    	   for(int i = 0; i < len; i++){
    		   if(queue.peek().left != null){queue.offer(queue.peek().left); }
    		   if(queue.peek().right != null){queue.offer(queue.peek().right);}
    		   sub.add(queue.poll().val);
    		   
    	   }
    	   result.add(sub);
    	   
       }
       
       
       
       return result;
    }
	

		
		
		
		
		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package z_215_kth_largest_element_in_an_array;

import java.util.PriorityQueue;

public class Solution {
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length; i++){
        	queue.add(nums[i]);
        	if(queue.size() > k) queue.poll();
        }
        
        return queue.peek();
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

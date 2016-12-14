package z_75_Sort_Color;

import java.util.PriorityQueue;

public class Solution {
	public void sortColors(int[] nums) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		int size = nums.length;
		
		for(int i = 0; i < nums.length; i++){
			heap.add(nums[i]);
		}
		
		for(int i = 0; i < size; i++) {
			nums[i] = heap.poll();
		}
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

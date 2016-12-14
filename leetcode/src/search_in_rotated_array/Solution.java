package search_in_rotated_array;

public class Solution {
	public int search(int[] nums, int target) {
		int len = nums.length;
		int lo = 0, hi = len - 1;
		while(lo < hi){
			int mid = (lo + hi)/2;
			if(nums[mid] > nums[hi]) lo = mid + 1;
			else hi = mid;
		}
		int head = lo;
		if(target == nums[head]) return head;
		int start = (target <= nums[len - 1])? head: 0;
		int end = (target <= nums[len - 1])? len - 1: head - 1;
		
		
		while(start <= end){
			int mid = (start + end)/2;
			if(nums[mid] == target) return mid;
			if(nums[mid] < target) start = mid + 1;
			else end = mid;
		}
		return -1;
        
    }

}

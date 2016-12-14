package z_81_search_in_rotated_sorted_array2;

public class Solution {
	public boolean search(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			if(nums[mid] == target) return true;
			if(nums[mid] > nums[hi]){
				if(target > nums[mid]) lo = mid + 1;
				else hi = mid;
			}else if(nums[mid] < nums[hi]){
				if(target > nums[mid]) lo = mid + 1;
				else hi = mid;
			}else{
				hi--;
			}
		}
        return (nums[lo] == target)? true : false ;
    }

}

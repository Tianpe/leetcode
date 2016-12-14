package z_35_search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
    	int size = nums.length;
    	if(size == 0) return 0;
    	if(size == 1) {
    		if(target <= nums[0]) return 0;
    		else{return 1;}
    	}
        int start = 0, end = size -1;
        while(start + 1 == end){
        	int mid = start + (end - start)/2;
        	if(target == nums[mid]) return mid;
        	else if(target > nums[mid]) start = mid;
        	else{ end = mid;}
        }
        return start;
    }
}
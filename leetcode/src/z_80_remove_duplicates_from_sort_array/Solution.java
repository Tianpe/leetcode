package z_80_remove_duplicates_from_sort_array;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int size = 0;
		for(int i = 0; i < nums.length; i++){
			if(i < 2 || nums[i] > nums[size - 2]) nums[size++] = nums[i];
		}

        return size;
    }

}

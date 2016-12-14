package Remove_Duplicates_from_Sorted_Array;

public class Solution2 {
	public static int removeDuplicates(int[] nums){
		if(nums.length == 0) return 0;
		if(nums.length == 1) return 1;
		else{
			int size = 0;
			for(int i = 1; i < nums.length; i++){
				if(nums[i] == nums[size]) continue;
				else{
					nums[++size] = nums[i];
				}
			}
			return size+1;
		}
		
		
		
	
	}
}

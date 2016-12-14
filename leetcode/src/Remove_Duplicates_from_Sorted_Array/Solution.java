package Remove_Duplicates_from_Sorted_Array;

public class Solution {
	public static int removeDuplicates(int[] nums){
//		if(nums == null){return 0;}
//		else if(nums.length == 1){return 1;}
//		else{
//			int num = 0;
//			int point = 0;
//			for(int i = 0; i<nums.length; i++){
//				if(nums[i] == nums[i+1] && nums[i] != nums[i-1]){
//					point = i+1;
//				}
//				if( nums[i] != nums[i-1]){
//					num++;
//					nums[point] = nums[i];
//				}
//			}
//		}
//		
//		
		int i = 0;
		for(int n : nums){
			if(i == 0 || n>nums[i-1]){
				nums[i++] = n;
			}
		return i;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

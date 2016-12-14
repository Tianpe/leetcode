package z_34_Search_for_Range;

public class Solution {
	public static int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int[] result = {2,-1};
		
		while(start < end){
			int mid = (start + end)/2;
			if(target > nums[mid]) {start = mid + 1;}
			else{end = mid;}
		}
		if(nums[start] != target) return result;
		result[0] = start;
		
		end = nums.length - 1;
		while(start < end){
			int mid = (start + end)/2 + 1;
			if(target < nums[mid]){end = mid - 1;}
			else{start = mid;}
		}
		result[1] = start;
		
		
		return result; 
	}
        
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,6,7};
		int b = 5;
		int[] result = searchRange(a,b);
		System.out.println(result[0] + "  "+ result[1]);

	}

}

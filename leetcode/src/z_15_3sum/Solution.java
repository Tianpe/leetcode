package z_15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++){
			int sum = 0 - nums[i];
			int head = i+1, tail = nums.length-1;
			while(head < tail){
				if(nums[head] + nums[tail] == sum){
					res.add(Arrays.asList(nums[i], nums[head], nums[tail]));
					while(nums[head] == nums[head+1]) head++;
					while(nums[tail] == nums[tail]+1) tail++;
				}
				else{
					if(nums[head] + nums[tail] > sum) tail--;
					if(nums[head] + nums[tail] < sum) head++;
				}
				
			}
		}
		return res;
        
    }

}

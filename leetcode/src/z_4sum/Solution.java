package z_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 3; i++){
			if(i == 0 || (i > 0 && nums[i] > nums[i-1])){
				for(int j = i + 1; j < nums.length - 2; j++){
					if(j == (i + 1) || (j > (i + 1) && nums[j] > nums[j - 1])) {
						int head = j + 1, tail = nums.length - 1;
						while(head < tail){
							int sum = nums[head] + nums[tail] + nums[i] + nums[j];
							if(sum == target){
								res.add(Arrays.asList(nums[i], nums[j], nums[head],nums[tail]));
								while(head < tail && nums[head] == nums[head + 1]){head++;}
								while(head < tail && nums[tail] == nums[tail - 1]){tail--;}
								head++;
								tail--;
							}else if(sum > target){ tail--;}
							else {head++;}
						}
				}
				}
			}
		}
		return res;
        
    }

}

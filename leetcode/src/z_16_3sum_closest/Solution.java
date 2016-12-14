package z_16_3sum_closest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = nums[0] + nums[1] + nums[nums.length - 1];
		int dif = Math.abs(sum - target);
		for(int i = 0; i < nums.length; i++){
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
				int head = i + 1, tail = nums.length - 1;
				while(head < tail){
					int newsum = (nums[i] + nums[head] + nums[tail]);
					if(newsum == target ){
						return target;
					}else {
						if(Math.abs(newsum - target) < dif){
							dif = Math.abs(newsum - target);
							sum = newsum;
						}
						if(newsum > target) tail--;
						if(newsum < target) head++;
					}
				}
			}
		}
		
		
		return sum;
        
    }

}

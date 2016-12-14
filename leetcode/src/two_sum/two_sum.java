package two_sum;

import java.util.HashMap;
import java.util.Map;

public class two_sum {
	public static int[] twoSum(int[] nums, int target){
		int[] result = new int[2];
		Map <Integer, Integer> map = new HashMap <Integer,Integer>();
		for(int i =0; i< nums.length;i++){
			int diff = target - nums[i];
			if(map.get(diff)== null){
				map.put(nums[i], i);
			}else{
				int a = map.get(diff);
				result[0] = a;
				result[1] = i;
				return result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,7,11,15};
		int target = 26;
		int [] result = twoSum(test,target);
		for(int i= 0; i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}

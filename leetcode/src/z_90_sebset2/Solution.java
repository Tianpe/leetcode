package z_90_sebset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsetsWithDup(int[] num){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		int len = num.length;
		if(len == 0) return res;
		if(len == 1) res.add(new ArrayList<Integer>(num[0]));
		int[] nums = new int[len + 1];
		for(int i = 0; i < len; i++) nums[i] = num[i];
		nums[len] = Integer.MAX_VALUE;
		
		for(int i = 0; i < len; i++){
			if((i == len - 1 && nums[i] != nums[i - 1]) || nums[i] != nums[i + 1]){
				List<List<Integer>> list = new ArrayList<List<Integer>>(res);
				for(List<Integer> array : list){
					array.add(nums[i]);
				}
				res.addAll(list);
				
			}
			if(nums[i] == nums[i + 1]){
				int j = i;
				while(j < len - 1 && nums[j] == nums[j + 1]){j++;}
				List<List<Integer>> list = new ArrayList<List<Integer>>(res);
				List<List<Integer>> temp = new ArrayList<List<Integer>>();
				for(int k = 0; k <= (j - i); k++){					
					for(List<Integer> array : list){
						array.add(nums[i]);
					}
					temp.addAll(list);
					
				}
				i = j;
				res.addAll(temp);
			}
		}
		return res;
	}

}

package z_78_subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length == 0) return res;
		res.add(new ArrayList<Integer>());
		
		for(int num: nums){
			int size = res.size();
			for(int j = 0; j < size - 1; j++){
				List<Integer> temp = new ArrayList<Integer>(res.get(j));
				temp.add(num);
				res.add(temp);
			}
		}

		return res;
	}

}

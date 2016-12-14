package z_39_combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        int len = candidates.length;
        List<Integer> temp = new ArrayList<Integer>();
        helper(res, temp, candidates, target, 0 );
        return res;
    }
	
	public void helper(List<List<Integer>> res, List<Integer> temp, int[] array, int remain, int start  ){
		if(remain < 0) return;
		else if(remain ==0) res.add(temp);
		else{
			for(int i = 0; i < array.length; i++){
				temp.add(array[i]);
				helper(res, temp, array, remain - array[i], array[i]);
				temp.remove(temp.size() - 1);
				
			}
		}
	}
}

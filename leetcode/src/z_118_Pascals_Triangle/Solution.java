package z_118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> one = new ArrayList<Integer>();
    	one.add(1);
    	res.add(one);
    	if(numRows == 1) return res;  	
    	for(int i = 2; i <= numRows; i++){
    		List<Integer> temp = new ArrayList<Integer>();
    		for(int j = 1; j <= i; j++){
    			if(j == 1 || j == i) temp.add(1);
    			else{
    				temp.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
    			}
    		}
    		res.add(temp);
    	}
    	
    	return res;
        
    }
}
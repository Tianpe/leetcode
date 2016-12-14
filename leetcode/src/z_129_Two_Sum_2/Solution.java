package z_129_Two_Sum_2;

public class Solution {
	public static int[] twoSum(int[] num, int target) {
	    int[] result = {0,0};
	    int len = num.length;
	    int j = len-1;
	    for(int i = 0; i < len;){
	    	int sum = num[i] + num[j];
	    	if(sum == target){
	    		result[0] = i+1;
	    		result[1] = j+1;
	    		return result;
	    	}
	    	else if(sum > target){
	    		j--;
	    	}
	    	else{
	    		i++;
	    	}
	    }
	    	
	    
	    
	    
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,1,2,4,7,999,1000};
		int [] result = twoSum(test, 7);
		for(int i = 0; i< result.length; i++){
			System.out.println(result[i]);
		}

	}
}

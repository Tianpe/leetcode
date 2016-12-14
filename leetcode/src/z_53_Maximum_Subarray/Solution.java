package z_53_Maximum_Subarray;

public class Solution {
	public int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = 0;
		
		for(int i = 1; i < nums.length; i++){
			dp[i] = nums[i] + (dp[i-1]>0?dp[i-1]:0);
			max = Math.max(max, dp[i]);
		}
		
	
	
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

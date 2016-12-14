package z_45_jump_game_2;

public class Solution {
	public int jump(int[] nums) {
		int curmax = 0, nextmax = 0, step = 0;
		for(int i = 0; i < nums.length; i++){
			if(i > nextmax) return -1;
			
			if(i <= curmax){
				nextmax = Math.max(i + nums[i], nextmax);
				
			}else{
				curmax = nextmax;
				step++;
			}
			if(nextmax >= nums.lenght - 1) return step + 1;
			
		}
		
		
		return -1;
    }

}

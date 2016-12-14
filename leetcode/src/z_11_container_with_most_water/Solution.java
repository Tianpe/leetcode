package z_11_container_with_most_water;

public class Solution {
	public int maxArea(int[] height) {
		if(height.length <= 1) return (Integer) null;
		int head = 0;
		int tail = height.length - 1;
		int max = 0;
		while(head < tail){
			max = Math.max(max, Math.min(height[head], height[tail])*(tail - head));
			if(height[head] < height[tail]) head++;
			else tail--;
		}
		
		return max;
        
    }
}

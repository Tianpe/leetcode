
public class z_42_trapping_rain_water {
	public int trap(int[] height) {
		int len = height.length;
		if(len < 3) return 0;
		int leftmax = 0, rightmax = 0, max = 0;
		int left = 0, right = len - 1;
		while(left < right){
			if(leftmax <= rightmax){
				leftmax = Math.max(left, leftmax);
				max += (leftmax - height[left]);
				left++;
			}else{
				rightmax = Math.max(right, rightmax);
				max += (rightmax - height[right]);
				right--;
			}
		}
		
		
		
        return max;
    }
	
	

}

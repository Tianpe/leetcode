package z_84_largest_rectangle_in_histogram;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
    	int area = 0;
    	int len = heights.length;
    	int hi = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i  =0; i <= len; i++){
    		hi = (i == len) ? 0 : heights[i];
    		if(stack.isEmpty() || hi > stack.peek()){
    			stack.add(i);
    		}else{
    			int index = stack.pop();
    			area = Math.max(area, heights[index] * (stack.isEmpty() ? i : (i - 1 - stack.peek())));
    			i--;
    		}
    		
    	}
        return area;
    }
}
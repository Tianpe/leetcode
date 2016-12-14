package z_74_search_2d_matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;
        int beg = 0, end = total - 1;
        while(beg < end){
        	int mid = beg + (end - beg)/2;
        	int rows = mid/row;
        	int cols = mid%row;
        	if(matrix[rows][cols] == target) return true;
        	else if(matrix[rows][cols] < target) beg = mid + 1;
        	else end = mid;
        	
        }
        return false;
    }
    
    
}

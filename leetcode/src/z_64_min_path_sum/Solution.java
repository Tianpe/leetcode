package z_64_min_path_sum;

public class Solution {
	public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if(col == 0 && row == 0) return 0;
        if(col == 1 && row == 0) return grid[0][0];
        int [][] matrix = new int[row][col];
        
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col; j++){
        		if(i == 0 && j == 0) matrix[0][0] = grid[0][0];
        		else if(i == 0) matrix[0][j] = grid[0][j - 1] + grid[0][j];
        		else if(j == 0) matrix[i][0] = grid[i][0] + grid[i - 1][0];
        		else {
        			matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i][j - 1]) + grid[i][j];
        		}
        	}
        }
        
        
        return matrix[row - 1][col - 1];
    }

}

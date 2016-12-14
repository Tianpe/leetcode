package z_54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>() ;
		if (matrix.length == 0) {
            return res;
        }
		int col = matrix[0].length;
		int row = matrix.length;
		int colbeg = 0, rowbeg = 0;
		
		if(matrix == null) return res;
		
		while(colbeg < col && rowbeg < row){
			
			
			for(int i = colbeg; i < col - 1; i++){
				res.add(matrix[rowbeg][i]);
			}
			rowbeg++;
			for(int i = rowbeg; i < row - 1; i++){
				res.add(matrix[i][col]);
			}
			col--;
			if(rowbeg <= row){
				for(int i = col; i > colbeg; i--){
					res.add(matrix[row][i]);
				}
			}
			row--;
			if(colbeg <= col){
				for(int i = row; i > rowbeg; i--){
					res.add(matrix[i][colbeg]);
				}
			}
			colbeg++;
		}
		return res;
		
        
    }
}

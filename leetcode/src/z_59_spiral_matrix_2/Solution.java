package z_59_spiral_matrix_2;

public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];
		if(n == 0) return res ;
		if(n == 1) {res[0][0] = 1; return res;}
		
		int rowbeg = 0, rowend = n - 1, colbeg = 0, colend = n - 1, num = 1;
		while(rowbeg <= rowend && colbeg <= colend && num <= n*n){
			for(int i = colbeg; i <= colend; i++){
				res[rowbeg][i] = num++;
			}
			rowbeg++;
			for(int i = rowbeg; i <= rowend; i++){
				res[i][colend] = num++;
			}
			colend--;
			if(rowbeg <= rowend){
				for(int i = colend; i >= colbeg; i--){
					res[rowend][i] = num++;
				}
			}
			rowend--;
			if(colbeg <= colend){
				for(int i = colend; i >= colbeg; i--){
					res[i][colbeg] = num++;
				}
			}
			colbeg++;
		}
		
		
		return res;
        
    }

}

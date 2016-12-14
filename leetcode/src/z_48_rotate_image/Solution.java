package z_48_rotate_image;

public class Solution {
	public void rotate(int[][] matrix) {
		reverse(matrix);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++ ){
				if(i < j)swap(matrix, i, j, j, i);
			}
		}
        
    }
	
	public void reverse(int[][] matrix){
		for(int i = 0; i < matrix.length/2; i++){
			for(int j = 0; j < matrix[i].length; j++){
				swap(matrix, i, j, matrix.length - i - 1, j);
			}
		}
	}
	
	public void swap(int[][] matrix, int x1, int y1, int x2, int y2){
		int temp = matrix[x1][y1];
		matrix[x1][y1] = matrix[x2][y2];
		matrix[x2][y2] = temp;
		
	}

}

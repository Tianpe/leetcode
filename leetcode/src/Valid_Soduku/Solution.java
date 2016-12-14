package Valid_Soduku;

import java.util.HashSet;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		for(int i = 0; i<9; i++){
			HashSet<Character> row = new HashSet<Character>();
			HashSet<Character> col = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();
			
			for(int j = 0; j<9; j++){
				if(board[i][j] != '.'&& !row.add(board[i][j])){
					return false;
				}
				if(board[j][i] != '.'&& !col.add(board[j][i])){
					return false;
				}
				int cube_col = 3*(i%3);
				int cube_row = 3*(i/3);
				if(board[cube_row + j/3][cube_col + j%3] != '.'&& !cube.add(board[cube_row + j/3][cube_col + j%3])){
					return false;
				}
				
				
			}
		}
		
	
	
	
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

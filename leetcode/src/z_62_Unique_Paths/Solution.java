package z_62_Unique_Paths;

public class Solution {
	public static int uniquePaths(int m, int n) {
		if(m == 1 || n == 1) return 1;
		return uniquePaths(m-1, n) + uniquePaths(m, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(5,7));
	}

}

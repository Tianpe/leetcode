package Reverse_Integer;

public class Solution {
	
	public static int reverse(int x){
//		if(x == 0){return 0;}
//		int sign = x < 0 ? -1 : 1;
//		x = Math.abs(x);
		
		int result = 0;
		while(x != 0){
			int end = x%10;
			int newResult = result * 10 + end ;
			if((newResult - end)/10 != result){
				return 0;
			}
			result = newResult;
			x = x/10;
		}	
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = reverse(-123401);
		System.out.println(a);
	}

}

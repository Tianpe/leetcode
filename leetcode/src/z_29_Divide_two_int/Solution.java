package z_29_Divide_two_int;

public class Solution {
	public static int divide(int dividend, int divisor) {
		int sign = 1;
		if((dividend > 0 && divisor < 0)||(dividend < 0 && divisor > 0)) {sign = -1;}
		if(divisor == 0) return Integer.MAX_VALUE;
		if(dividend == 0) return 0;
		
		long up = Math.abs(dividend), down = Math.abs(divisor);
		long result = divideHelper(up,down);
		if(result > Integer.MAX_VALUE){
			if(sign == 1)return Integer.MAX_VALUE;
			return Integer.MIN_VALUE;
		}
		if((dividend > 0 && divisor < 0)||(dividend < 0 && divisor > 0)) {return (int)(0-result);}
		else{return (int)result;}
		
	}
	
	private static long divideHelper(long dividend, long divisor){
		if(dividend < divisor) return 0;
		
		long multiply = 1;
		long divisor_2 = divisor;
		while(divisor_2 + divisor_2 <= dividend){
			divisor_2 += divisor_2;
			multiply += multiply;
		}
		return multiply+divideHelper(dividend-divisor_2,divisor);
	}
	

	public static void main(String[] args) {
		int a = divide(13,3);
		System.out.print(a);

	}

}

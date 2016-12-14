package Palindrome_Number;

public class Solution {
	public static boolean isPalindrome(int x){
		if(x%10 == x){return true;}
		if(x%10 == 0){return false;}
		String str = Integer.toString(Math.abs(x));
		char[] charArray = str.toCharArray();
		int i = 0;
		while(charArray.length - 1 - i > 0){
			if(charArray[i] != charArray[charArray.length - 1 -i]){return false;}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 1;
		System.out.println(isPalindrome(a));

	}

}

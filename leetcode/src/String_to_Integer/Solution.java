package String_to_Integer;

public class Solution {
	public static int myAtoi(String str){
		if(str.isEmpty()){return 0;}
		char[] ca = str.toCharArray();
		int len = ca.length;
		int i = 0, sign = 1;
		int result = 0;
		while(ca[i] == ' '){i++;};
		if(ca[i] == '-'){sign = -1; i++;}
		if(ca[i] == '+'){i++;};
		while (ca[i]>='0' && ca[i]<='9'){
			result = (ca[i++]-'0') + result*10;
			if(result > Integer.MAX_VALUE){return Integer.MAX_VALUE;}
			if(result < Integer.MIN_VALUE){return Integer.MIN_VALUE;}
			if(i == len){break;}
			
		}
		
		return result*sign;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "  -103344bb55";
//		char[] ca = a.toCharArray();
//		for(int i = 0;i < ca.length; i++){
//		System.out.println(ca[i]);
//		}
		System.out.println(myAtoi(a));
	}

}

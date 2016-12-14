package ZigZag_Conversion;

public class Solution {
	
	public static String convert(String s, int numRows){
		char[] charArray = s.toCharArray();
		StringBuffer[] sb = new StringBuffer[numRows];
		for(int i=0;i<sb.length;i++){
			sb[i] = new StringBuffer();
		}
		int j = 0;
		while(j<charArray.length){
			for(int index = 0; index<numRows&&j<charArray.length;index++){
				sb[index].append(charArray[j++]);
			}
			for(int ind = numRows-2; ind>=1&&j<charArray.length;ind--){
				sb[ind].append(charArray[j++]);
			}
		
		}
		for(int i = 1; i<sb.length; i++){
			sb[0].append(sb[i]);
		}
		return sb[0].toString();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = convert("PAYPALISHIRING",3);
		System.out.println(a);
	}

}

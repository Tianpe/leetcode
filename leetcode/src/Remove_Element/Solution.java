package Remove_Element;

public class Solution {
	public static int strStr(String haystack, String needle) {
		int s1 = haystack.length(), s2 = needle.length();
		if(s1 < s2) return -1;
		if(haystack == needle) return 0;
		int threshold = s1 -s2;
		
		for(int i = 0;i < threshold; i++){
			if(haystack.substring(i, i+s2).equals(needle)) return i;
		}
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

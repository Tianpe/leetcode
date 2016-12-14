package Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int romanToInt(String s){
		char[] charArray = s.toCharArray();
		int i = 0;
		int result = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int pre = 0;
		for(int j = charArray.length - 1; j >= 0; j--){
			if(pre <= map.get(charArray[j])){result = result + map.get(charArray[j]);}
			else{result = result - map.get(charArray[j]);}
			pre = map.get(charArray[j]);
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

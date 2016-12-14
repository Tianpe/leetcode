package z_3_Longest_Substring_Without_Repeating_Character;

import java.util.HashMap;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		HashMap <Character, Integer> hashmap = new HashMap<Character, Integer>();
		int max = 0;
		int j = 0;
		for(int i = 0; i < s.length(); i++){
			if(hashmap.containsKey(s.charAt(i))){
				j = Math.max(j, hashmap.get(s.charAt(i))+1);
			}
			hashmap.put(s.charAt(i), i);
			max = Math.max(max, i-j+1);
		}
			
		return max;
    }

}

package Valid_Parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
    	char[] ca = s.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
    	for(int i = 0; i < ca.length; i++){
    		if(ca[i] == '('||ca[i] == '['||ca[i] == '{'){
    			 stack.push(ca[i]);
    		}
    		else if(ca[i] == ')'&&stack.peek() == '('&& !stack.empty()){
    			stack.pop();
    		}
    		else if(ca[i] == ']'&&stack.peek() == '['&&!stack.empty()){
    			stack.pop();
    		}
    		else if(ca[i] == '}'&&stack.peek() == '{'&&!stack.empty()){
    			stack.pop();
    		}
    		else{return false;}
    	}
    	
        return stack.empty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

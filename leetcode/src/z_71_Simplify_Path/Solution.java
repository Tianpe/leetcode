package z_71_Simplify_Path;

import java.util.Stack;

public class Solution {
	public static String simplifyPath(String path) {
		String[] array = path.split("/");
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < array.length; i++){
			if(array[i].equals(".") || array[i].isEmpty()) continue;
			if(array[i].equals("..") && !stack.isEmpty()) {stack.pop();}
			if(!array[i].equals("..")) {stack.push(array[i]);}
			
		}
		String result = String.join("/", stack);
        return "/" + result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/a/b/../.././c/d/";
		String res = simplifyPath(path);
		System.out.println(res);
	}

}

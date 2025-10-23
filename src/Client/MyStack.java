package Client;

import java.util.Stack;

public class MyStack {
	
	public static void reverseUsingStack(String str) {
		int n = str.length();
		
		Stack<Character> st = new Stack<Character>();
		
		
		for(int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String str = "my name is Karan Kumar";
		
		
		StringBuilder sb = new StringBuilder(str);
		
		reverseUsingStack(str);
		
	}
}

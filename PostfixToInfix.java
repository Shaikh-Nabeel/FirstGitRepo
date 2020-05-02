package GeeksForGeeks;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
	static boolean isOperand(char c) {
		if(c >='a' && c<='z' || c>= 'A' && c<= 'Z') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<String> st = new Stack<>();
		for(int i = 0; i<s.length(); i++) {
			if(isOperand(s.charAt(i))) {
				st.push(s.charAt(i)+"");
			}
			else {
				String x1 = st.pop();
				String y1 = st.pop();
				st.push("("+y1+s.charAt(i)+x1+")");
			}
		}
		System.out.println(st.pop());
	}

}

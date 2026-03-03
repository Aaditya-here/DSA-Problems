package Interview;

import java.util.Stack;

public class MatchingParanthesis {
	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);

			} else {
				if (stack.isEmpty()) {
					return false;
				}

				char topElement = stack.pop();

				if ((c == ')' && topElement != '(') || (c == '}' && topElement != '{')
						|| (c == ']' && topElement != '[')) {
					return false;

				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s1 = "()[]{}";
		String s2 = "([)]";
		MatchingParanthesis matchingParanthesis = new MatchingParanthesis();
		boolean res1 = matchingParanthesis.isValid(s1);
		boolean res2 = matchingParanthesis.isValid(s2);

		System.out.println(s1 + " = " + res1 + " AND " + s2 + " = " + res2);

	}

}

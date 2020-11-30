
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	public static void main(String args[]) throws Exception {

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = "";

		while ((s = br.readLine()) != null) {

			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < s.length(); i++) {
				if (stack.empty()) {
					stack.push(s.charAt(i));
				} else if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{')
						|| (s.charAt(i) == ']' && stack.peek() == '[')) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}

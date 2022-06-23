import java.util.Scanner;
import java.util.Stack;

public class B9012_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> stack = new Stack<Character>();
		StringBuffer sb = new StringBuffer();

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String str = sc.next();

			for (int j = 0; j < str.length(); j++) {
				if (!stack.isEmpty() && str.charAt(j) == ')' && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(str.charAt(j));
				}
			}
			if (stack.size() == 0) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
			stack.clear();
		}

		System.out.println(sb);

		sc.close();
	}
}
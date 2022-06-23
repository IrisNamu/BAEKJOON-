import java.util.Scanner;

public class B9012_DO_NOT_USE_STACK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String inp = sc.next();
			int res = 0;
			boolean b = true;

			for (int j = 0; j < inp.length(); j++) {
				char c = inp.charAt(j);
				if (c == '(') {
					res++;
				} else {
					res--;
					if (res < 0) {
						b = false;
						break;
					}
				}
			}
			if (res == 0 && b == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
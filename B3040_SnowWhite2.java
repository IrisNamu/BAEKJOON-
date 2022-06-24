import java.util.Scanner;

public class B3040_SnowWhite2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		int num1 = 0, num2 = 0;
		int a = 0, b = 0;
		for (a = 0; a < arr.length; a++) {
			for (b = 0; b < arr.length; b++) {
				if (sum - arr[a] - arr[b] == 100 && a != b) {
					num1 = a;
					num2 = b;
					break;
				}
			}
		}

		System.out.println("\nnum1 : " + num1 + ", num2 : " + num2);

		for (int k = 0; k < arr.length; k++) {
			if (k != num1 && k != num2) {
				System.out.print(arr[k] + " ");
			}
		}
	}
}
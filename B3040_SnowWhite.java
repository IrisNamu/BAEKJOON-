import java.util.Scanner;

public class B3040_SnowWhite {

	public static void main(String[] args) {
		int[] arr = new int[9];
		int sum = 0;
		int real = 0;
		int liar1 = 0;
		int liar2 = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] != arr[i] && arr[i] != arr[j]) {
					System.out.println(arr[j]);

					do {
						real = arr[j];
					} while (sum - arr[i] - arr[i] == 100);

					System.out.println(arr[j]);
				}
			}
		}
		sc.close();

	}

}
package Baekjoon;

import java.util.Scanner;

public class star_2_another {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringBuilder star = new StringBuilder(); //문자열을 다루는 클래스
		StringBuilder air = new StringBuilder();

		int cut = scan.nextInt();

		for (int i = 1; i <= cut; i++)
			air.append(' ');

		for (int i = 1; i <= cut; i++) {
			star.append('*');
			air.setLength(cut - i);

			System.out.print(air);
			System.out.println(별);
		}

		scan.close();
	}
}
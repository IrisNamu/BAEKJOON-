package Baekjoon;

import java.util.Scanner;

public class star_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 0; i < num; i++) { // 행을 뜻함 (행의 갯수)
			for (int j = 0; j < num - i - 1; j++) { // 안쪽 공백...4..3..2..1..감소
				System.out.print(" "); // 첫줄에 공백 4개 찍히면 성공
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

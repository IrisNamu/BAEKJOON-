package baekjoon;

import java.util.Scanner;

class Stack_ {
	// �迭 ���� �غ��� �������. �迭 ũ�� �ν��Ͻ� �� ����
	int[] arr = new int[10000];

	// ����/������ �Ͼ�� ���� ������ top����
	int top = 0;

	// ���ڸ� �Է� ������ �������� �׾��ش�.
	void push(int n) {
		arr[top] = n;
		top++; // ������� ����Ű������
	}

// ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�
//���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	int pop() {
		if (top == 0) {
			return -1;
		} else {
			top--;
			return arr[top];
		}
	}

	// ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	int size() {
		return top;
	}

	// ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	int empty() {
		if (top == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// ������ ���� ���� �ִ� ������ ����Ѵ�.
	// ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	int top() {
		if (top == 0) {
			return -1;
		} else {
			return arr[top - 1]; // ���� �� ����� ����Ŵ. ���̸� 0�� �����Ƿ� ���� ���� ���´�.
		}
	}
}

public class B10828_Stack {

	public static void main(String[] args) {

		Stack_ stk = new Stack_();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String input = sc.next();

			switch (input) {
			case "push":
				stk.push(sc.nextInt());
				break;

			case "pop":
				System.out.println(stk.pop());

				break;
			case "size":
				System.out.println(stk.size());

				break;
			case "empty":
				System.out.println(stk.empty());

				break;
			case "top":
				System.out.println(stk.top());

				break;

			default:
				break;
			}
		}

		sc.close();
	}

}

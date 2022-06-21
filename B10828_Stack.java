package baekjoon;

import java.util.Scanner;

class Stack_ {
	// 배열 선언 해보기 멤버변수. 배열 크기 인스턴스 값 생성
	int[] arr = new int[10000];

	// 삽입/삭제가 일어나는 쪽인 스택의 top선언
	int top = 0;

	// 숫자를 입력 받으면 차곡차곡 쌓아준다.
	void push(int n) {
		arr[top] = n;
		top++; // 빈허공을 가리키고있음
	}

// 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다
//만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int pop() {
		if (top == 0) {
			return -1;
		} else {
			top--;
			return arr[top];
		}
	}

	// 스택에 들어있는 정수의 개수를 출력한다.
	int size() {
		return top;
	}

	// 스택이 비어있으면 1, 아니면 0을 출력한다.
	int empty() {
		if (top == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// 스택의 가장 위에 있는 정수를 출력한다.
	// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	int top() {
		if (top == 0) {
			return -1;
		} else {
			return arr[top - 1]; // 맨위 빈 허공을 가리킴. 빈값이면 0이 나오므로 원래 값이 나온다.
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

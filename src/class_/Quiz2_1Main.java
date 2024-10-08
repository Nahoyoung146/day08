package class_;

import java.util.Scanner;

public class Quiz2_1Main {
	public static void main(String[] args) {
		Quiz2_1Test t = new Quiz2_1Test();
		t.print(t.input());
	}
}

class Quiz2_1Test {
	public int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		int[] arr = { num1, num2 };
		return arr;
	}

	public void print(int[] arr) {
		if (arr[0] > arr[1])
			System.out.println("큰 수 : " + arr[0]);

		else if (arr[0] < arr[1])
			System.out.println("큰 수 : " + arr[1]);

		else
			System.out.println("두 수는 같습니다.");
	}
}
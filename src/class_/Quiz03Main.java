package class_;

import java.util.Scanner;

public class Quiz03Main {
	public static void main(String[] args) {
		Quiz03Test t = new Quiz03Test();
		t.cal(t.input());
	}
}

class Quiz03Test {
	public int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		int[] arr = { num1, num2 };
		return arr;
	}

	public void cal(int[] arr) {
		System.out.println("두 수의 합 : " + (arr[0] + arr[1]));
	}
}
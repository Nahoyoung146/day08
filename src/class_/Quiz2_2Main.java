package class_;

import java.util.Scanner;

public class Quiz2_2Main {
	public static void main(String[] args) {
		Quiz2_2Test t = new Quiz2_2Test();
		t.print(t.input());
	}
}

class Quiz2_2Test {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	public void print(int num) {
		if (num % 2 == 0)
			System.out.println(num + "은(는) 짝수입니다.");

		else
			System.out.println(num + "은(는) 홀수입니다.");
	}
}
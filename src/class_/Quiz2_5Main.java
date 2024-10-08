package class_;

import java.util.Scanner;

public class Quiz2_5Main {
	public static void main(String[] args) {
		Quiz2_5Test t = new Quiz2_5Test();
		t.print(t.input());
	}
}

class Quiz2_5Test {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	public void print(int num) {
		if (num <= 0)
			System.out.println(num + "의 절대값은(는) " + (num * -1) + "입니다.");

		else
			System.out.println(num + "의 절대값은(는) " + num + "입니다.");
	}
}
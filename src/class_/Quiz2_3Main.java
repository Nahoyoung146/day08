package class_;

import java.util.Scanner;

public class Quiz2_3Main {
	public static void main(String[] args) {
		Quiz2_3Test t = new Quiz2_3Test();
		t.print(t.input());
	}
}

class Quiz2_3Test {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	public void print(int num) {
		if (num % 3 == 0)
			System.out.println(num + "은(는) 3의 배수입니다.");

		else
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
	}
}
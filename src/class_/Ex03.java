package class_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("짝수");
		else {
			System.out.println("홀수");
		}

		System.out.print("수 입력 : ");
		num = input.nextInt();
		if (num % 3 == 0)
			System.out.println("3 배 수");
		else {
			System.out.println("3 배 수 아님!!!");
		}
	}
}
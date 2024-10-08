package class_;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		TestClass08 t = new TestClass08();
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		sum = t.sumFunc(num);
		System.out.println("1 ~ " + num + " : " + sum);

		t.test1();
		t.test2(1, "");

		String a = t.get(111111);
	}
}
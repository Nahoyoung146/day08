package class_;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		t.sumFunc(num);
	}
}
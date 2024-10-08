package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04Main {
	public static void main(String[] args) {
		Quiz04Test t = new Quiz04Test();
		t.cal(t.input());
	}
}

class Quiz04Test {
	public ArrayList<Integer> input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(num1);
		arr.add(num2);
		return arr;
	}

	public void cal(ArrayList<Integer> arr) {
		System.out.println("두 수의 합 : " + (arr.get(0) + arr.get(1)));
	}
}
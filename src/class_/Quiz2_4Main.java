package class_;

import java.util.Scanner;

public class Quiz2_4Main {
	public static void main(String[] args) {
		Quiz2_4Test t = new Quiz2_4Test();
		t.print(t.input());
	}
}

class Quiz2_4Test {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	public void print(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if (count == 2)
			System.out.println(num + "은(는) 소수입니다.");

		else
			System.out.println(num + "은(는) 소수가 아닙니다.");
	}
}
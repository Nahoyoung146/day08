package class_;

import java.util.Scanner;

public class Quiz02Main {
	public static void main(String[] args) {
		Quiz02Test t = new Quiz02Test();
		t.print(t.input());
	}
}

class Quiz02Test {
	Scanner sc = new Scanner(System.in);
	String[] str = new String[3];

	public String[] input() {
		for (int i = 0; i < str.length; i++) {
			System.out.print("이름 입력 : ");
			str[i] = sc.next();
		}
		return str;
	}

	public void print(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println("이름 : " + str[i]);
		}
	}
}
package class_;

import java.util.Scanner;

public class Quiz01Main {
	public static void main(String[] args) {
		Quiz01Test t = new Quiz01Test();
		t.print(t.input());
	}
}

class Quiz01Test {
	public String input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void print(String name) {
		System.out.println("이름 : " + name);
	}
}
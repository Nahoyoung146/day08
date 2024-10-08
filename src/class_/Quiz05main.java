package class_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz05main {
	public static void main(String[] args) {
		Quiz05Test t = new Quiz05Test();
		t.cal(t.input());
	}
}

class Quiz05Test {
	public HashMap<String, Integer> input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(num1);
		arr.add(num2);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("첫번째 숫자", arr.get(0));
		map.put("두번째 숫자", arr.get(1));
		return map;
	}

	public void cal(HashMap<String, Integer> map) {

		System.out.println("두 수의 합 : " + (map.get("첫번째 숫자") + map.get("두번째 숫자")));
	}
}
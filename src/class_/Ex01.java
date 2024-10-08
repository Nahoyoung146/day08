package class_;

import java.util.ArrayList;

import members_.MemberClass;

public class Ex01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		System.out.println(m.addr);
		System.out.println(m.name);

		ArrayList<String> s;
		MemberClass mm = new MemberClass();
		mm.allPrint();
		mm.name = "111";
		mm.addr = "222";
		mm.allPrint();
	}
}
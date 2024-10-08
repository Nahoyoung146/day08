package class_;

public class TestClass09 {
	public int inputData() {
		// 입력기능
		int num = 5;
		return num;
	}

	public int sumFunc(int num) {
		// 연산기능
		num += 100;
		return num;
	}

	public void print(int num, int s) {
		System.out.println(num + ", " + s);
	}
}
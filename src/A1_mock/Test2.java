package A1_mock;

public class Test2 {
	public static void main(String args[]) {
		Test2.m2();
		Test2.m3("aish", "zol");
		Test3.data1();

	}

	public static void m2() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	public static void m3(String a, String b) {
		System.out.println("string a is " + a + "string b is " + b);

	}

}

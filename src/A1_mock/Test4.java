package A1_mock;

public class Test4 {
	public static void main(String args[]) {
		Test4 da= new Test4();
		da.data1();
		da.data2(10,36.30, 68.30);
		
		Test3 da1= new Test3();
		da1.data4();

	}

	public void data1() {
		System.out.println("data1");

	}
	public void data2(long a, double b,double c) {
		double d = a+b+c;
		System.out.println(d);
	}

}

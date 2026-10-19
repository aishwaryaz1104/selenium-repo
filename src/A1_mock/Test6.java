package A1_mock;

public class Test6 {
	public static void main(String args[]) {
		int age= 18; 

		if(age<=18) {
			System.out.println("you can access the portal with valid id ");
		}
		else if(age>=20) {
			System.out.println("you can access the portal with valid card");
		}
		else if(age==30) {
			System.out.print("you can access the portal with valid PASS");
		}
		else {
			System.out.print("access denied");

		}
	}

}

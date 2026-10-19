package A1_mock;

public class Test5 {
	public static void main(String args[]) {
		String id= "aish";
		String pass = "test1";
		int key =63798;
		if (id =="aish") 
		{
			System.out.println("id is correct enter password");
			if (pass=="test1" ) 
			{
				System.out.println("pass is correct enter pass");
				if(key==63798) 
				{
					System.out.println("key correct");
				}
				else
				{
					System.out.println("wrong key");
				}
				
			}
			
			else 
			
			{
				System.out.println("pass is wrong enter correct password ");
			}
			
		}
		
		else 
		{
			System.out.println("id is wrong plz enter correct id");
		}
	}

}

package basics.programs;

public class LogicalOpeartors3 
{
	public static void main(String[] args) 
	{
		System.out.println("Start the Main Method");
		int a=100;
		int b=200;
		
		if(!(a>b || b==200))
			/*if(!(false || true))
			 * if(!(true))
			 * if(false)
			 */
		{
			System.out.println("Execute 1");
		}
		
		int age=20;
		char gender='M';

		if(age>=18 || gender=='F')
		{
			System.out.println("Execute 2");
		}
		
		System.out.println("End the Main Method");

		
		
	}
}

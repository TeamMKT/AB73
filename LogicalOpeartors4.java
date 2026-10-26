package basics.programs;

public class LogicalOpeartors4 
{
	public static void main(String[] args) 
	{
		System.out.println("Start the Main Method");
		int a=100;
		int b=200;
		
		if(a>b && b==200)
		{
			System.out.println("Execute 1");
		}
		
		int age=20;
		char gender='M';

		/*(false && false) || true
		 * false ||true
		 * true
		 */
		if(((age>=18 && gender=='F' ) && (a==b)) || (a==100))
			/*if( false && false)
			 * 
			 * 
			 */
		{
			System.out.println("Execute 2");
		}
		
		System.out.println("End the Main Method");

		
		
	}
}

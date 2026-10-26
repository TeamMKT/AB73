package module2.programs;

public class MethodOverChild extends MethodOverParent
{
	void login()
	{
		System.out.println("Login Using mobile no");
		super.login();

	}
	public static void main(String[] args) 
	{
		MethodOverChild m1=new MethodOverChild();
		m1.login();
		
		}
}

package module2.programs;

public class DuplicateVariable 
{
	int d=7;
	static int a=100;//global
	static void login()
	{
		System.out.println("Login To AMazon");
		DuplicateVariable a1=new DuplicateVariable();
		a1.add();
		a1.sub();
	}
	public static void main(String[] args) 
	{
		login();
//		int a=200;//Local
	//	System.out.println(a);
		//System.out.println(DuplicateVariable.a=18765);
		
		
	}
	void add()
	{
		System.out.println(d);
		System.out.println(a);
		sub();
	}
	void sub()
	{
			System.out.println("subtraction");
	}
}

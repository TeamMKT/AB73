package module2.programs;
class K3
{
	K3()
	{
		this("Manish");
		System.out.println("Constructor 3");

	}
	K3(String name)
	{
		System.out.println("Constructor 6");

	}
}
class K2 extends K3
{
	K2(int a)
	{
		
		System.out.println("Constructor 2");
	}
	K2()
	{
		this(5);
		System.out.println("Constructor 5");
	}
}
public class K1 extends K2
{
	K1()
	{
		System.out.println("Constructor 1");
	}
	K1(int a)
	{
		this();
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) 
	{
		new K1(100);
		System.out.println("*******************");
		new K2();
	}
}

package module2.programs;

public class C1 extends C2
{
	static void mul()
	{
		System.out.println("Mul Method");
	}
	public static void main(String[] args) 
	{
		mul();
		add();
		System.out.println(a);
		C1 c1=new C1();
		c1.sub();
		mod();
		c1.random();
	}
}

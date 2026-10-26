package basics.programs;

public class GlobalVariable2 
{
	int a=100;//global variable-Instance Variable
	static int b=200;//global variable
	
	static int d;
	//d=10; this is not allowed in java
	static String name;
	public static void main(String[] args) 
	{
		System.out.println(d);
		System.out.println(name);

		d=100;//this is how we can update the value of global variable as well
		b=900;//updating the global variable
		System.out.println(d);
		System.out.println(b);
		GlobalVariable2 g1=new GlobalVariable2();
		System.out.println(g1.a=900);
	}
}

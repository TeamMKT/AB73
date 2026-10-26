package basics.programs;

public class GlobalVariable 
{
	int a=100;//global variable-Instance Variable
	static int b=200;//global variable
	static void add()
	{
		int f=100;//local varibale
		double h=87.98;//local varibale
	}
	public static void main(String[] args) 
	{
		System.out.println(b);
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.a);
	}
}

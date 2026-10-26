package basics.programs;

public class AmazonParametersMethod 
{
	AmazonParametersMethod(int a,char b,String c,boolean d)//local variable
	{
		System.out.println("This is cons");
	}
	static void add(int a,int b)//this is your static method //local variable
	{
		System.out.println(a+b);

	}
	double subtract(double a,double b)//this is your non static method //local variable
	{
		double c=	a-b;
		return c;
	}
	public static void main(String[] args) //this is your main method
	{
		System.out.println("Main Method");
		AmazonParametersMethod f1=new AmazonParametersMethod(100,'A',"AMazon",true);
		add(10,90);
		System.out.println(f1.subtract(10.9,87.76));

		
		/*
		 * Syntax of creating an Object:
ClassName referance_Variable=new ClassName();
or
new ClassName();
		 * 
		 * 
		 */
	}
}

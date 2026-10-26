package basics.programs;

public class FlipkartProgram //extends Object
{
	
	void add()//this is your static method
	{
		System.out.println("Static Method");

	}
	void subtract()//this is your non static method
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) //this is your main method
	{
		Object o1=	new FlipkartProgram();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Main Method");
		FlipkartProgram f1=new FlipkartProgram();
		
	//	f1->We can access alla Object class Prop
		f1.add();
		f1.subtract();

		FlipkartProgram f2=new FlipkartProgram();
		f2.add();
		f2.subtract();
		
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

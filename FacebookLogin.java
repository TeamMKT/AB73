package basics.programs;

public class FacebookLogin 
{
	FacebookLogin()  //this is your constructor
	{
		System.out.println("Constructor");
	}
	static void add()//this is your static method
	{
		System.out.println("Static Method");

	}
	void subtract()//this is your non static method
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) //this is your main method
	{
		System.out.println("Main Method");
		add();
		FacebookLogin f1=new FacebookLogin();
		//new FacebookLogin();
		f1.subtract();

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

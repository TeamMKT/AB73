package moduel3;

public class SIbProgram 
{
	{
		System.out.println("IIB");//this gets call only after creating an Object
	}
	SIbProgram()
	{
		System.out.println("Constructor");//this gets call only after creating an Object

	}
	public static void main(String[] args) 
	{
		
		System.out.println("Main method");
		new SIbProgram();
	}
	static
	{
		System.out.println("SIB");
	}
}

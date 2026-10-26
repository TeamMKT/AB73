package moduel3;

public class SIbProgram2 
{
	static
	{
		System.out.println("SIB");//this gets call only after creating an Object
	}
	{
		System.out.println("IIB");
	}
	SIbProgram2()
	{
		System.out.println("Constructor 1 ");//this gets call only after creating an Object
	}
	SIbProgram2(int a)
	{
		System.out.println("Constructor 2");//this gets call only after creating an Object
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Main method");
		new SIbProgram2();
		new SIbProgram2(100);

	}

}

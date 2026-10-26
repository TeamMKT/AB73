package moduel3;
public class ArithmaticExceptionProgram 
{
	public static void main(String[] args) 
	{
	try {	
		int a=1/0;    //1 from grand parent and 0 is coming from parent class
	}
	catch(ArithmeticException a1)
	{
		System.out.println("Handled the exception");
	}	
		
	}
}

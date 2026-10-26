package module2.programs;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerProgram 
{
	public static void main(String[] args) 
	{
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter the value of a:");
		int a=	s1.nextInt();
		System.out.println("Please Enter the value of b:");
		int b=	s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of the 2 Numbers:"+sum);
		s1.close();
		}
		catch(InputMismatchException i1)
		{
			
			System.out.println("Hanlded the exception 1");
			System.out.println("Please Enter int value only");
			try {	
			Scanner s1=new Scanner(System.in);
			System.out.println("Please Enter the value of a:");
			int a=	s1.nextInt();
			System.out.println("Please Enter the value of b:");
			int b=	s1.nextInt();
			int sum=a+b;
			System.out.println("Sum of the 2 Numbers:"+sum);
			s1.close();
					}
			catch(InputMismatchException i2)
				{
				System.out.println("Hanlded the exception 2");

				}
		}
		finally
		{
			System.out.println("Any common activities");
		}
		
	}
}

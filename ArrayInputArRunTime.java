package module2.programs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInputArRunTime 
{
	public static void main(String[] args) 
	{
try {		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter the size of the Array:");
		int rollno[]=new int[s1.nextInt()];
		
	for(int i=0;i<=rollno.length;i++)
	{
		System.out.println("Please Enter the value of Array at index:"+i);
		rollno[i]=s1.nextInt();
	}	
	
	System.out.println(Arrays.toString(rollno));
	s1.close();
	}
catch(ArrayIndexOutOfBoundsException a1)
{
	System.out.println("Handlded the eexception, lets take the size COrrect");
}
catch(NegativeArraySizeException a1)
{
	System.out.println("Handlded the eexception,lets make sure we are not enetering the -ve value for your size of te array");
}
catch(InputMismatchException j1)
{
	System.out.println("please neter int value only for size and values");
}
finally
{
	
	System.out.println("any common message");
	System.out.println("CLosing the connection with DB");
	System.out.println("Closing the connection from the serveer");
}


}

}

package basics.programs;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Plese enter 1 for Withdraw Money");
		System.out.println("Plese enter 2 for deposit Money");
		System.out.println("Plese enter 3 for changing language Money");
		System.out.println("Plese enter 4 for Checking balance");
		System.out.println("Plese enter 5 for changing my PIN");

		int value=s1.nextInt();//it can also come at run time->just ;ike OTP
			
		switch(value)
		{
		case 1:System.out.println("Activity 1");
				break;
			
		case 2:System.out.println("Activity 2");
				break;
			
		case 3:
			System.out.println("Activity 3");
			break;
			
		case 4:
			System.out.println("Activity 4");
			break;
			
		case 5:
			System.out.println("Activity 5");
			break;
		
		default:
			System.out.println("Hey wrong selection, Please enter only 1,2, 3 or 4");
		
		}
		s1.close();
		
	}
	
}

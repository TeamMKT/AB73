package module2.programs;

public class PalindromeStrings 
{

	public static void main(String[] args) 
	{
		String input="rotator";
		String output="";
	//	output.isEmpty();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=	input.charAt(i);
			output=output+c1;
		
		}
		System.out.println("This is my Output:"+output);
		System.out.println("This is my Input:"+input);
		
		if(input.equals(output))
		{
			System.out.println("Yes, it is a Palindrome");	
		}
		else
		{
			System.out.println("No, it is not a palindrome");
		}
		
		
		
	}
}

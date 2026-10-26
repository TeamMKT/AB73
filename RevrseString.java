package module2.programs;

public class RevrseString 
{

	public static void main(String[] args) 
	{
		String input="school";
		String output="";
	//	output.isEmpty();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=	input.charAt(i);
			output=output+c1;
			/*i=5,c1=l
			 * output=l
			 * i=4,c1=o
			 * output=l+o=lo
			 * i=3,c1=o
			 * output=lo+o=loo
			 * i=2,c1=h
			 * output=loo+h=looh
			 * i=1,c1=c
			 * output=looh+c=loohc
			 * i=0,c1=s
			 * output=loohc+s=loohcs
			 * 
			 */
		}
		System.out.println("This is my Output:"+output);
		System.out.println("This is my Input:"+input);

		
		
		
	}
}

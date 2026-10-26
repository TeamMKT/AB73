package module2.programs;

import java.util.Arrays;

public class StrinFunction 
{
	public static void main(String args[]) 
	{
		String a="bangalore";
		
		
		char [] c1=a.toCharArray();
		
		
		System.out.println(Arrays.toString(c1));
		
		
		String b="My name is Ram";
		
		char c2[]=	b.toCharArray();
		
		System.out.println(Arrays.toString(c2));
		
		String [] s1=	b.split(" ");
		System.out.println(Arrays.toString(s1));

	}

}

package module2.programs;

import java.util.Arrays;

public class StringAnagram 
{
	public static void main(String[] args) 
	{
		String a="ear";
		String b="are";
		
		
		if(a.length()!=b.length())
		{
			System.out.println("They can never be anagram");
		}
		else
		{
			char [] c1=	a.toCharArray();
			char [] c2=	b.toCharArray();
			System.out.println("Before Sorting:");

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After Sorting:");

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("The 2 GIven Strings are Anagaram");
			}
			else
			
				 {
				System.out.println("The 2 GIven Strings are NOT Anagaram");
				 }
			
			
		}
		
		
	}
}




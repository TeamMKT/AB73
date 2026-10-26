package module2.programs;
public class AlphabetInTheGivenString 
{
	static int countOfAlpha=0;
	static int countOfNumeric=0;
	static int countOfSpace=0;

	public static void main(String[] args) 
	{
		String input="K V No 2 Bangalore *&^%$";
		char [] c1=	input.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);

		//		if(Character.isAlphabetic(c1[i])
		//		if(Character.isAlphabetic(c1[i]==true)

		//if(b1==true)
			if(b1)
			{
			countOfAlpha++;
			}
			if(b2)
			{
			countOfNumeric++;
			}
			if(b3)
			{
			countOfSpace++;
			}
		}
		System.out.println("Your Input is:->"+input);
		System.out.println("Total count of Alphabets:->"+countOfAlpha);
		System.out.println("Total count of Numbers/Digit:->"+countOfNumeric);
		System.out.println("Total count of Space:->"+countOfSpace);
		 int countOfSpecialChar=input.length()-(countOfAlpha+countOfNumeric+countOfSpace);
			System.out.println("Total count of SpecialChar:->"+countOfSpecialChar);

	}
}




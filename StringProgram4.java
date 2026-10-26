package module2.programs;
public class StringProgram4 
{
	public static void main(String[] args) 
	{
		String a="Hello Java";//String Pool ARea
		//Memory Efficient COncept
		String b="Hello Java";//String Pool ARea
		//Both a and b are using the same "Hello Java" instead of creating the duplicate space
		System.out.println(a==b);//checking if the adrress of the 2 are same?
		
		boolean b3=	a.equals(b);
		System.out.println(b3);
		String a1=new String("Hello Java");//heap Memory
		//not aMemory Efficient COncept
		String a2=new String("Hello Java");//heap Memory
		//Both a1 and a2 are using the different "Hello Java" utilising the duplicate memory space

		System.out.println(a==a1);//checking if the adrress of the 2 are same?
		System.out.println(a1==a2);//checking if the adrress of the 2 are same?

		
		
	
	}
}

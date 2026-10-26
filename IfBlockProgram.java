package basics.programs;
public class IfBlockProgram 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a==100)//false
		{
			System.out.println("Execute it 1");
		}
		if(a!=100)//true
		{
			System.out.println("Execute it 2");
		}
		if(a>100)//false
		{
			System.out.println("Execute it 3");
		}
		if(a<100)//true
		{
			System.out.println("Execute it 4");
		}
		if(a>=100)//false
		{
			System.out.println("Execute it 5");
		}
		if(a<=100)//true
		{
			System.out.println("Execute it 6");
		}
		System.out.println("End of the Program");
	}
}

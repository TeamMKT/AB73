package basics.programs;
public class NestedIFElseBlock 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		if(a==10)
		{
			System.out.println("Statement 1");
			if(b<=a)
			{
				System.out.println("Statement 2");
				if(c==10)
				{
					if(b>c)
					{
						
					}
					
				}
			}
			else
			{
				System.out.println("Statement 3");
			}
		}
		else
		{
			System.out.println("Statement 4");
			
		}
		
		
	}
}

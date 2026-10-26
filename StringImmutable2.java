package module2.programs;
public class StringImmutable2 
{
	public static void main(String[] args) 
	{

		
		StringBuffer s1=new StringBuffer("Hello Java");
		s1.insert(5, " Hi");
		System.out.println(s1);
		
		
		s1.replace(0, 5, "Morning");
		
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Laptop Working");
		s2.delete(0, 6);
		System.out.println(s2);
		
	}
}

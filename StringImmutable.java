package module2.programs;
public class StringImmutable 
{
	public static void main(String[] args) 
	{
/*		String a="Java";
		String b=	a.concat(" Programming");
		System.out.println(a);
		System.out.println(b);
		//String are immutable
	*/	
		
		StringBuffer s1=new StringBuffer("Java");
		s1.append("Programming");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Javascript");
		s2.append("Programming");
		System.out.println(s2);
	}
}

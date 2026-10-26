package module2.programs;
public class StringBuilderMethods 
{
	public static void main(String[] args) 
	{
		StringBuilder s0=new StringBuilder();
		StringBuilder s9=new StringBuilder(100);

		
	StringBuilder s1=new StringBuilder("Java");
	
	
	StringBuffer c1=new StringBuffer();
	StringBuffer c2=new StringBuffer(57);

	
	StringBuffer c3=new StringBuffer("Java");
	
/*	System.out.println(s1.reverse());
		s1.append(" Programming");
		
	System.out.println(s1);
	
	s1.insert(0, "Advanced ");
		System.out.println(s1);
	
		s1.delete(0, 3);
*/
	String s2=	s1.substring(2)	;
	System.out.println(s2);
	String s4=	s1.substring(0, 3);
		System.out.println(s4);
		
		
		

	}
}

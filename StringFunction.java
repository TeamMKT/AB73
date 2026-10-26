package module2.programs;
public class StringFunction 
{
	public static void main(String[] args) 
	{
		String a="Ram is laughing";
		        //  0123456789
		System.out.println(a.length());
		
		char c1=	a.charAt(2);
		System.out.println(c1);
		System.out.println(a.charAt(4));
		
		
		String b="Mango";
		String c="Mango";
		boolean b1=	b.equals(c);
		System.out.println(b1);
		String d="mango";
		System.out.println(b.equals(d));
		System.out.println(b.equalsIgnoreCase(d));
		
		System.out.println(b.concat(" is tasty"));
		System.out.println(b.replace('M', 'm'));
		
		String e="My school name is KV";
		
		System.out.println(e.replace("school", "College"));
	
		System.out.println(e.substring(3));
		System.out.println(e.substring(3,9));
		String e1="My                        school name is KV";
		String e2="             My school name is KV        ";
System.out.println(e2);
		System.out.println(e2.trim());

	}
}

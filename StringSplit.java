package module2.programs;

import java.util.Arrays;

public class StringSplit 
{
	public static void main(String[] args) 
	{
		String a="My name is Vishnu";
		String [] s1=	a.split(" ", 4);
	System.out.println(Arrays.toString(s1));
	
	
	String b="auto";
	System.out.println(b.replace('a', 'A'));
	System.out.println(a.replace("Vishnu", "Ram"));
	String c="Manish Kumar Tiwari";
	System.out.println(c.replaceAll("[a-z]", ""));
	System.out.println(c.replaceAll("[A-Z]", ""));
	String d="k v no 2 bangalore";
	System.out.println(d.replaceAll("[0-9]", ""));

	System.out.println(b.matches("a(.*)"));
	//equals,contains and matches
	System.out.println(b.matches("(.*)o"));
	System.out.println(a.matches("(.*)name(.*)"));
	String url="https://www.google.com/reviewproduct";
	System.out.println(url.matches("https(.*)"));
	
	}
}

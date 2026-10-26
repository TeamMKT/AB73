package moduel3;
public class WideniingProgram 
{
	public static void main(String[] args) 
	{
		int a=100;
		
		double a1=	a;//widening-impllicitely
		System.out.println(a1);
		double a2=(double)	a;//widening-explicit
		System.out.println(a2);
		
		
		double f=4.7;
		
		int s1=(int)f;//narrowing-explicit
		System.out.println(s1);
		
		
		int x=10;
		
		long x1=	x;
		System.out.println(x1);
		
		
	}
}

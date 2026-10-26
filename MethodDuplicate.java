package basics.programs;
/*Method Overloading:
 * 
 * 
 */
public class MethodDuplicate 
{
	static void add()
	{
		System.out.println("Start start adding:");
	}
	void add(int a,int b)//local variable
	{
		int c=a+b;
		System.out.println(c);
	}
	 void add(int a,double b)//local variable
	{
		double c=a+b;
		System.out.println(c);
	}
	static void add(double  a,int b)//local variable
	{
		double c=a+b;
		System.out.println(c);
	}
	static void add(double a,double b)//local variable
	{
		double c=a+b;
		System.out.println(c);
	}
	static void sub(int a,int b)
	{
		
	}
	static void sub(double a,double b)
	{
		
	}static void sub(double a,int b)
	{
		
	}
	public static void main(String[] args) 
	{
		add();
		MethodDuplicate m1=new MethodDuplicate();
		m1.add(40,70);
		m1.add(40,7.5);
		add(40.9,70);
		add(5.4,7.7);


	}
}

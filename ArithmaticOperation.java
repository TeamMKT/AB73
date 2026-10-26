package basics.programs;
public class ArithmaticOperation 
{
	public static void add()
	{
			int a=100;//dec and init
			 a=190;//updated the local variable
		int b=300;//dec and init
		int sum=a+b;// a and b utilization
		System.out.println(sum);
		
	}
	static void sub()
	{
		int a1=400;//dec and init
		int b1=300;//dec and init
		int c1=a1-b1;// a and b utilization
		System.out.println(c1);
		
	}static void mul()
	{
		int a2=15;//dec and init
		int b2=300;//dec and init
		int c2=a2*b2;// a and b utilization
		System.out.println(c2);
		
	}static void div()
	{
		int a3=8;//dec and init
		int b3=2;//dec and init
		int c3=a3/b3;// a and b utilization
		System.out.println(c3);
		
	}
	static void mod()
	{
		int a4=15;//dec and init
		int b4=9;//dec and init
		int c4=a4%b4;// a and b utilization
		System.out.println(c4);
	
	}
	public static void main(String[] args) 
	{
		int x=908;
		System.out.println("Start of the Program");
		add();
		sub();
		mul();
		div();
		mod();
	
		
		System.out.println("End of the Program");

		
		}
}

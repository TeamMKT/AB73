package moduel3;

public class ReturnKyword
{
	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	static double add(double a,int b)
	{
		double sum=a+b;
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(add(90,10));
		System.out.println(add(90.77,10));

	}
}

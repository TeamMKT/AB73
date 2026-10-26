package basics.programs;

public class AmazonProgram
{
	AmazonProgram()
	{
		this(9.66);
		System.out.println("COns 1");
	}
	AmazonProgram(double a)
	{
		this("MKT");
		System.out.println("COns 2");
	}
	AmazonProgram(String a)
	{
		this(10,26);
		System.out.println("COns 3");
	}
	AmazonProgram(int a,int b)
	{
		System.out.println("COns 4");
	}
	AmazonProgram(int a,double b)
	{
		this();
		System.out.println("COns 5");
	}
	public static void main(String[] args) 
	{
		new AmazonProgram(10,98.98);
	}
}

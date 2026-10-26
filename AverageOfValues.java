package module2.programs;

public class AverageOfValues 
{
	public static void main(String[] args) 
	{
	
		double [] a1=new double[7];
		a1[0]=9;
		a1[1]=6;
		a1[2]=5;
		a1[3]=10;
		a1[4]=23;
		a1[5]=7;
		a1[6]=4;

		double sum=0;
		
		for(int i=0;i<a1.length;i++)
		{
		sum=sum+a1[i];//9->15->20->30
		}
		System.out.println(sum);

		double avergae=sum/a1.length;
		
		System.out.println("Average of all the numbers:->"+avergae);
	}
}

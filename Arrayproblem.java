package module2.programs;

import java.util.Arrays;

public class Arrayproblem 
{
	public static void main(String[] args) 
	{
		/*
		 * DataType [] variable=new DataType[size]; 
or
DataType  variable[]=new DataType[size]; 
		 */
		
		int [] rollno=new int[4];
		rollno[0]=90;
		rollno[1]=76;
		rollno[2]=98;
		rollno[3]=12;
		
		System.out.println(Arrays.toString(rollno));

		String [] name=new String[4];
		name[0]="Ram";
		name[1]="Pawan";
		name[2]="Pramod";
		name[3]="Priya";
		System.out.println(Arrays.toString(name));

		double d3[]=new double[4];
		d3[0]=6.5;
		d3[1]=7.5;
		d3[2]=5.5;
		d3[3]=6.7;
		System.out.println(Arrays.toString(d3));


		
		
	}
}

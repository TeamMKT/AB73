package module2.programs;

import java.util.Arrays;

public class ArrayRevrse 
{
	public static void main(String[] args) 
	{
		
		int array1[]=new int[5];
		array1[0]=90;
		array1[1]=76;
		array1[2]=45;
		array1[3]=55;
		array1[4]=42;

		int array2[]=new int[array1.length];
		
	for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
	{
		array2[j]=array1[i];//i for array1
	
	}

	
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output Array:");
		System.out.println(Arrays.toString(array2));

		
	}
}

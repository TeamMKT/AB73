package module2.programs;

import java.util.Arrays;

public class ArrayCopyValue 
{
	public static void main(String[] args) 
	{
		
		int array1[]=new int[5];
		array1[0]=90;
		array1[1]=76;
		array1[2]=45;
		array1[3]=30;
		array1[4]=100;
		
		
		int array2[]=new int[array1.length];
		
	for(int i=0;i<array1.length;i++)
	{
		array2[i]=array1[i];
	
	}
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output Array:");
		System.out.println(Arrays.toString(array2));

		
	}
}

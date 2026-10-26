	package module2.programs;
	
	import java.util.Arrays;
import java.lang.Math;
	import java.util.Scanner;
	//WAP to check if the 2 arrays are equals
	public class ArrayEqualsProgram2 
	{
		public static void main(String[] args) 
		{
			int [] rollnoA=new int[4];
			rollnoA[0]=90;
			rollnoA[1]=76;
			rollnoA[2]=8888;
			rollnoA[2]=11;//updating the value of index position 2

			System.out.println(Arrays.toString(rollnoA));
			
			int [] rollnoB=new int[4];
			rollnoB[0]=90;
			rollnoB[1]=76;
			rollnoB[2]=98;
			rollnoB[3]=12;
			
			System.out.println(Arrays.toString(rollnoB));
			//	if(Arrays.equals(rollnoA, rollnoB))
			//	if(Arrays.equals(rollnoA, rollnoB)==true)
			boolean b1=Arrays.equals(rollnoA, rollnoB);
			
		if(b1)
			//if(b1==true)
	
		{
				System.out.println("The 2 arrays are equal");
				}
		else
		{
			System.out.println("The 2 arrays are not equal");
		}
		}
	}

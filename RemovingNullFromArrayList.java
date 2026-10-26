package moduel3;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingNullFromArrayList 
{
	public static void main(String[] args) 
	{
ArrayList<Character> a1=new ArrayList<Character>();
		
		a1.add('C');
		a1.add('J');
		a1.add('D');
		a1.add('H');
		a1.add(null);
		a1.add('A');
		a1.add('I');
		a1.add(null);
		a1.add('P');
		a1.add(null);
		System.out.println(a1);
		
		
		Iterator<Character> i2=	a1.iterator();
		
		while(i2.hasNext())
		{
			if(i2.next()==null)
			{
				i2.remove();
			}
		}
		System.out.println(a1);
		
		
		
		
		
			
	}
}

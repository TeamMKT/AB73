package moduel3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntoSet 
{
	public static void main(String[] args) 
	{
List<String> l1=	new ArrayList<String>();
		
		l1.add("Ram");
		l1.add("Mohan");
		l1.add("Pavan");
		l1.add("Priya");

		l1.add("Juli");
		System.out.println(l1);
		
		Set<String> s1=new HashSet<String>(l1);
		s1.add("Deep");
		s1.add("Parshuram");
		System.out.println(s1);
	}
}

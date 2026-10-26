package moduel3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods2 
{
	public static void main(String[] args) 
	{
		//account number and name of the customer
		Map<Integer,String> m1=	new HashMap<Integer,String>();
		m1.put(12345, "Ramu");
		m1.put(76543, "Sham");
		m1.put(98765, "Bheem");
		m1.put(56765, "Ritu");
		m1.put(76545, "Abhinav");
		m1.put(34567, "Priya");
		System.out.println(m1);
		
		m1.replace(76545, "Deepika");
		
		System.out.println(m1);
		
		
		Collection<String> d1=	m1.values();
		
		Set<Integer> d2=m1.keySet();
		
		
		
		
		//for each Loop
		System.out.println("All the Values:Customer Names");
		for( String s1        :         m1.values())
		{
			System.out.println(s1);
		}
		System.out.println("All the Keys:Account Numbers");
		for( Integer s2        :         m1.keySet())
		{
			System.out.println(s2);
		}
		System.out.println("All the Account Numbers:Customer Name");
		for( Entry<Integer, String> s3        :         m1.entrySet())
		{
			System.out.println(s3);
		}
		
		Set<Entry<Integer, String>> d3=m1.entrySet();
		Iterator<Entry<Integer,String>> d4=	d3.iterator();
		System.out.println("All the Account Numbers:Customer Name using Iterator:");

		while(d4.hasNext())
		{
			System.out.println(d4.next());
		}
		
	
	}
}

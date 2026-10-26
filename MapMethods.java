package moduel3;

import java.util.HashMap;
import java.util.Map;

public class MapMethods 
{
	public static void main(String[] args) 
	{
		Map m1=	new HashMap();
		m1.put("Maths", 90);
		m1.put("Sci", 80);
		m1.put("Eng", 80);
		m1.put("Hindi", 79);
		m1.put("SS", 99);
		
		System.out.println(m1);
		
		//key-should alwasys be unique-Set
		//value-soething that may have duplicates-Collection
		Map<String,Integer> m2=	new HashMap<String,Integer>();
		m2.put("Maths", 90);
		m2.put("Sci", 80);
		m2.put("Eng", 80);
		m2.put("Hindi", 79);
		m2.put("SS", 99);
		
		System.out.println(m2);
		
		m2.putIfAbsent("Sanskrit", 92);
		System.out.println(m2);
		Map<String,Integer> m3=	new HashMap<String,Integer>();
		m3.put("Pyh", 90);
		m3.put("Che", 80);
		m3.put("CS", 80);
		m3.put("BIO", 79);
		m3.put("Maths12", 99);
		
		System.out.println(m3);
		
		
		m3.putAll(m2);
		
		System.out.println(m3);
		
		
	//	m3.isEmpty();
		
		
	//	m3.clear();
		
		
	//	m3.size();
		
		boolean b1=	m3.containsKey("Network Anaylasis");
		System.out.println(b1);
		boolean b2=		m3.containsValue(90);
		System.out.println(b2);
		System.out.println("Before removing->"+m3);
		m3.remove("BIO");
		System.out.println(m3);
		m3.remove("SS", 99);
		System.out.println(m3);
		
		
		Integer v1=	m3.get("Maths");
		System.out.println(v1);
		
		
		boolean b4=	m3.equals(m2);
		System.out.println(b4);
		
		m3.replace("Eng", 80, 84);
		System.out.println(m3);
	}
}

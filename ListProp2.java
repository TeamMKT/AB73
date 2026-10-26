package moduel3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProp2 
{
	public static void main(String[] args) 
	{
		List<Object> l1=	new ArrayList<Object>();
		
		l1.add(90);
		l1.add(90);
		l1.add(null);
		l1.add(null);

		l1.add("English");
		l1.add(9.98);
		l1.add(false);
		l1.add('Z');
		l1.add(2);
		l1.add(91);
	
		Iterator<Object> o1=	l1.iterator();
		while(o1.hasNext())
		{
			System.out.println(o1.next());
		}
		
		ListIterator<Object> o2=	l1.listIterator();
		while(o2.hasNext())
		{
			System.out.println(o2.next());
		}
		while(o2.hasPrevious())
		{
			System.out.println(o2.previous());//
		}
		System.out.println(l1);
	
	
	
	}
}

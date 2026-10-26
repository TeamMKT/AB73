package moduel3;
import java.util.ArrayList;
import java.util.List;

public class ListProp 
{
	public static void main(String[] args) 
	{
		List<Object> l1=	new ArrayList<Object>();
		
		l1.add(90);
		l1.add("English");
		l1.add(9.98);
		l1.add(false);
		l1.add('Z');
		l1.add(2);
		l1.add(2);
		
		
		System.out.println(l1.get(4));
	
l1.iterator();
l1.listIterator();


		System.out.println(l1);
	
	
	
	}
}

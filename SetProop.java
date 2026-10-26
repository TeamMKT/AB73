package moduel3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProop 
{
	public static void main(String[] args) 
	{
		Set<Integer> productIds=	new HashSet<Integer>();
		
		productIds.add(876546);
		productIds.add(987678);
		productIds.add(345678);
		productIds.add(876567);
		productIds.add(null);

		productIds.add(765446);
		productIds.add(765576);//hashCode Value

		System.out.println(productIds);
	
		
		Iterator<Integer> ids=	productIds.iterator();
		while(ids.hasNext())
		{
			System.out.println(ids.next());
		}
	
	}
}

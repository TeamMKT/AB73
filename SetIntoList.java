package moduel3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntoList
{
	public static void main(String[] args) {
	Set<Integer> productIds=	new HashSet<Integer>();
		
		productIds.add(876546);
		productIds.add(987678);
		productIds.add(null);
		productIds.add(null);

		productIds.add(345678);
		productIds.add(876567);
		productIds.add(765446);
		productIds.add(765576);//hashCode Value

		System.out.println(productIds);
		
		List<Integer> l1=new ArrayList<Integer>(productIds);
		l1.add(999999);
		l1.add(987697);
		l1.add(null);
		l1.add(null);
		l1.add(null);

		System.out.println(l1);
	}
}

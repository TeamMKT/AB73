package moduel3;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProgram3 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> a1=new ArrayList<Character>();
		
		a1.add('C');
		a1.add('J');
		a1.add('D');
		a1.add('H');
		a1.add('A');
		a1.add('I');
		a1.add('P');
		System.out.println(a1);
		
		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(92.6);
		a2.add(95.6);
		a2.add(91.6);
		a2.add(99.6);
		a2.add(52.6);
		a2.add(52.6);
		a2.add(82.6);
		a2.add(99.6);

		System.out.println(a2);
		
	System.out.println(Collections.max(a2));
	System.out.println(Collections.min(a2));
	Collections.sort(a2);
	System.out.println(a2);
	Collections.reverse(a2);
	System.out.println(a2);
int count=	Collections.frequency(a2, 99.6);
System.out.println(count);
a2.remove(91.6);

		a2.add(4, 80.5);
		System.out.println(a2);
		
		
		ArrayList<Double> a3=new ArrayList<Double>();
a3.add(9.1);

a3.add(5.1);
a3.add(3.1);
a3.add(2.1);
a3.addAll(3, a2);
boolean b5=	a3.containsAll(a2);
System.out.println(b5);

System.out.println(a3);

a3.removeAll(a2);
System.out.println("Updated A3->"+a3);

	}
}

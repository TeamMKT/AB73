package moduel3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListProgram4 
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
		
		Iterator<Character> i1=	a1.iterator();
		/*
		 * next-Object
		 * hasnext-boolean
		 * remove
		 * Only do forward Iteration
		 * Iterator is applicbale to the entire Collection hirarchy/framework
		 * 
		 */
		System.out.println("Iteration using Iterator:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		ListIterator<Character> i5=	a1.listIterator();
		/*
		 * hasnext
		 * next
		 * haspreviois
		 * previous
		 * set
		 * remove
		 * Can do both forward Iteration + backword iteartion
		 * Only applicable for List and its classes
		 * 
		 */
		System.out.println("Forward Iteration using ListIterator:");
			while(i5.hasNext())
			{
				System.out.println(i5.next());
			}
			System.out.println("Backword Iteration using ListIterator:");

			while(i5.hasPrevious())
			{
				System.out.println(i5.previous());
			}
		
		
		
		
	}
}

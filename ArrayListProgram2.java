package moduel3;
import java.util.ArrayList;
public class ArrayListProgram2 
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
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		
	/*	System.out.println(a1.size());
		boolean b1=	a1.isEmpty();
		System.out.println(b1);
		//a1.clear();
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		System.out.println(a1);

	/*	a1.isEmpty();
		a1.remove(0);
		a1.remove(0);
		a1.removeAll(a1)
*/

	}
}

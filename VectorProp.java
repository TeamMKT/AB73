package moduel3;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProp 
{
	public static void main(String[] args)
	{
		
		Vector<String> v1=new Vector<String>();
		v1.addElement("Vishnu");
		v1.addElement("Gopala");
		v1.addElement("Manohar");
		v1.addElement("Priya");
		v1.addElement("Karishma");
		
		v1.add("Ganesh");
		System.out.println(v1);

		Enumeration<String> e1=	v1.elements();
		//nextElement and hasmoreelement-booleam
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		
		
		
		/*
		 * It contains List and Collection interface methods.
addElement(Object obj); ->Add the Element
firstElement();->Get the First Element
lastElement();->Get the last Element
removeElement(Object obj);->Remove the element 
or
remove(Object)
removeElementAt(int index);->Remove the element at the given index
or
remove(index)
removeAllElements();->Remove all the elements from the Collection
or
removeAll(Collection)
capacity();->Just like the length of the Array

		 */
		
	}
}

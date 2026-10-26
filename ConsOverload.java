package basics.programs;

public class ConsOverload
{
	ConsOverload()
	{
		this(100);//this calling statement
		/*This calling sttamenet should be the 1st line in the given cons.
		 * It can only be written explcitely(You need to write it)
		 * This Calling STatmenet will call one cons from anothwr cons within the same class
		 * This topic is also known as Constructor chaining.
		 * Just bcease cons are of 2 types:
		 * Thats the reason TCS are of 2 types:
		 * a) Non Para TCS:
		 * will call non para cons from anothwr cons within the same class
		 * b) Para TCS:
		 * will call para cons from anothwr cons within the same class

		 */
		System.out.println("COns 1");
	}
	ConsOverload(int a)
	{
		System.out.println("COns 2");
	}
	public static void main(String[] args) 
	{
		new ConsOverload();
	}
}

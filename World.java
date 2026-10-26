package basics.programs;
public class World 
{
	World(int a)
	{
		System.out.println("Constructor 1");
	}
	World(double a)
	{
		System.out.println("Constructor 2");
	}
	World(String a)
	{
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) 
	{
		new World(100);
		new World(98.87);
		new World("Automation");

	}
}

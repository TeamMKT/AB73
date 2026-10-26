package module2.programs;
 class L3            //Concerete class 
{
	void method4()//concrete method
	{
		System.out.println("");
	}
	void method5()//concrete method
	{
		System.out.println("");

	}
}
abstract class L2 extends N3    //abstarct class 
{
	abstract void add();//Abstarct Method
	abstract void sub(); //Abstarct Method

}
public class L1 extends N2       //Concerete Class
{
	public static void main(String[] args) //concrete method
	{
		
	}

	void add() //concrete method
	{
			System.out.println("Real Logic 1 by developer");
	}

	void sub() //concrete method
	{
		System.out.println("Real Logic 2 by developer");

	}
	void mul() //concrete method
	{
		System.out.println("Real Logic 3 by developer");
}

void div() //concrete method
{
	System.out.println("Real Logic 4 by developer");

}
}

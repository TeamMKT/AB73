package module2.programs;
public class Thiskeyword 
{
	String name;
	int rollno;
	double salary;
	void details(String std_name,int rollno,double salary)
	{
	this.name=std_name;
	this.rollno=rollno;
	this.salary=salary;

	}
	public static void main(String[] args) 
	{
		Thiskeyword ts=new Thiskeyword();
		ts.details("Raj", 39, 8.2);
		System.out.println(ts.name);
		System.out.println(ts.rollno);
		System.out.println(ts.salary);
	}
}

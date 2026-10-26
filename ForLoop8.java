package basics.programs;

public class ForLoop8 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of the Main Method");
for(int rows=1;rows<10;rows++) //1 to 9        1 row->3 times
{
		for(int column=1;column<4;column++)  //1 to 3
		{
			System.out.print(rows);
			System.out.println(column);

		}
}
		System.out.println("End of the Main Method");

		
	}
}

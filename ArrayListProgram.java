package moduel3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ArrayListProgram 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException, FileNotFoundException 
	{
		URL i1=new URL("https://www.google.com");
		
		Thread.sleep(2000);
		
		FileInputStream fs=new FileInputStream("C:\\Users\\MKT\\eclipse-workspace\\Ab70Maven\\test-output\\ExcelSheet\\Manish.xlsx");
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("Java");
		a1.add(98.9);
		a1.add(87654);
		a1.add('C');
		a1.add(false);
		System.out.println(a1);
		
	    // Creating a singleton set
        Set<String> singletonSet = Collections.singleton("Java");
        System.out.println("Singleton Set: " + singletonSet);
        singletonSet.add("Javascript");
        // Creating a singleton list
        List<String> singletonList = Collections.singletonList("Java");
        System.out.println("Singleton List: " + singletonList);

        // Creating a singleton map
        
Map<String, Integer> singletonMap = Collections.singletonMap("Java", 100);
        System.out.println("Singleton Map: " + singletonMap);


	}
}

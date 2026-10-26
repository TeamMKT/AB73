package moduel3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;

public class Throwkeyword 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		Thread.sleep(2000);
		URL u1=new URL("https://www.facebook.com");
		
		if(1>1)
		{
		throw new NullPointerException();
		}
		else
		{
		throw new InputMismatchException();
		}
	}
}

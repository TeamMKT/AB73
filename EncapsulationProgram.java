package moduel3;
class One
{
	private int age=29;//updating this to 78
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	private String emailid="rama@gmail.com";//updated to shiv@gmail.com
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	private String password="manish1234";
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
public class EncapsulationProgram 
{
	public static void main(String[] args) 
	{
		One o1=new One();
		o1.setAge(78);//this value amy comw from custimer
		System.out.println(o1.getAge());
		o1.setEmailid("shiv@gmail.com");
		System.out.println(o1.getEmailid());
		o1.setPassword("QWERTY^%$!@");
		System.out.println(o1.getPassword());
		
	}
}

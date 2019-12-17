import java.util.Scanner;
public class UserName {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the username");
		String name=s.next();
		String uname="Hello username how are you ";
		System.out.println(uname);
		String[] array=uname.split(" ");
		String result = null;
		if(name.length()>3) 
		{
		for (int i = 0; i < array.length; i++)
		{
			 result=uname.replace("username",name);
		}
		System.out.println(result);
	}
  }
}


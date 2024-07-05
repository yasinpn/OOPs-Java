package Lab;
import java.util.Scanner;
class Oddexception extends Exception
{
	public String toString()
	{
		return("ODD NUMBER EXCEPTION");
	}
}
class Evenexception extends Exception
{
	public String toString()
	{
		return("EVEN NUMBER EXCEPTION");
	}
}
public class evenoddexception
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
try
{
	if(n%2==0)
		throw new Evenexception();
	else
		throw new Oddexception();

}
catch(Evenexception a)
{
	System.out.println(a);
}
catch(Oddexception b)
{
	System.out.println(b);
}

	}

}

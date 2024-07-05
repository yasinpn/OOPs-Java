package Lab;
import java.util.Scanner;
class EvenException extends Exception
{
	EvenException(String s)
	{
		super(s);
	}
}
class OddException extends Exception
{
	OddException(String st)
	{
		super(st);
	}
}

public class oddevenexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		int n=sc.nextInt();
		try
		{
			if(n%2==0)
				throw new EvenException("The number is Even");
			else
			throw new OddException("The number is Odd");		
		}
		catch(OddException a)
		{
	     System.out.println(a);
		}
		catch(EvenException b)
		{
			System.out.println(b);
			
		}
}}

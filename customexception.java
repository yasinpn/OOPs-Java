package Lab;
import java.util.*;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
public class customexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	try
	{
		if(age<18)
		throw new MyException("Error,Ineligible to vote");
		else
		System.out.println("Eligible to vote");
	
	}
	catch(MyException e)
	{
		System.out.println(e);
	}
	}
}

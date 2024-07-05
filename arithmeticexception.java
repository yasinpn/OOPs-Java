package Lab;
import java.io.*;
import java.util.Scanner;
public class arithmeticexception
{
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	        try {
	        	System.out.println("Enter the 2 numbers");
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int c = a/b;  // cannot divide by zero
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println (e);
	        }
	    }
}
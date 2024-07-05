package Lab;
import java.io.*;
import java.util.*;
public class exceptionarrayindex {
	    public static void main (String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        try
	        {
	
	        	System.out.println("Enter the size of the array");
                int s=sc.nextInt();
	             System.out.println("Enter the elements of the array ");
	             int arr[]=new int[s];
	             for(int i=0;i<s;i++)
	              arr[i]=sc.nextInt();
	             System.out.println("Enter the location to be accessed");
	             int l=sc.nextInt();
	        System.out.println(arr[l]);
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	      
	         System.out.println(e);
	        }
	        catch(NegativeArraySizeException n)
	        {
	        	System.out.println(n);
	        }
	finally {
	             System.out.println("End of operation");
	        }
	} }

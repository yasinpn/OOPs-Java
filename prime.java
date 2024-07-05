package Lab;
import java.util.*;
public class prime{

	public static void main(String[] args) {
		int flag=0;
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int a=sc.nextInt();
if(a==1)
	System.out.println("The number is unique");
else
{
	for(int i=2;i<a/2;i++)
	{
		if(a%i==0)
		{
	flag++;	
			break;
	}
	}
		if(flag==0)
			System.out.println("The number is prime");
		else
			System.out.println("The number is composite");
}
sc.close();
	}

	}

package Lab;
import java.util.Scanner;
public class secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
	int n,ss=0;
	System.out.println("Enter the length of the array");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	for(int i=1;i<n;i++)
	{
		if(arr[i]!=arr[i-1])
		{
			ss=arr[i];
			break;
		}
	}
	System.out.println("Second smallest is "+ss);
	sc.close();
		}
	}


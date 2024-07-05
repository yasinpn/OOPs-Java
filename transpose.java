package Lab;
import java.util.Scanner;
public class transpose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows and columns");
int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];

System.out.println("Enter the elements ");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		arr[i][j]=sc.nextInt();
	}
}
System.out.println("MATRIX");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(arr[i][j]+"\t");	
	}
System.out.println();
}
System.out.println("TRANSPOSE");
for(int i=0;i<c;i++)
{
	for(int j=0;j<r;j++)
	{
		System.out.print(arr[j][i]+"\t");	
	}
System.out.println();
}
sc.close();
	}}

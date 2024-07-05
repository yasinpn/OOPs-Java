package Lab;
import java.util.Scanner;
public class matrixmultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first matrix rows and columns");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	System.out.println("Enter the second matrix rows and columns");
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	int mat1[][]=new int[r1][c1];
	int mat2[][]=new int[r2][c2];
	int m[][]=new int[r1][c2];
	System.out.println("Enter the first matrix");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			mat1[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("Enter the second matrix");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			mat2[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("The First Matrix");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(mat1[i][j]+"\t");	
		}
	System.out.println();
	}
	System.out.println("The Second Matrix");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(mat2[i][j]+"\t");	
		}
	System.out.println();
	
	}
	if(c1==r2)
	{
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c2;j++)
		{
			m[i][j]=0;
		for(int k=0;k<r2;k++)
	m[i][j]+=mat1[i][k]*mat2[k][j];
	}}
	System.out.println();
	System.out.println("Product-->");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(m[i][j]+"\t");	
		}
		System.out.println();}}
		else
			System.out.println("Incompatible");
	sc.close();
	}}

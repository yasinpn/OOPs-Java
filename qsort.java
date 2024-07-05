import java.util.*;
import java.io.*;

public class qsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int l=sc.nextInt();
		sc.nextLine();
		String s[]=new String[l];
		System.out.println("Enter the strings");
		for(int i=0;i<l;i++)
			s[i]=sc.nextLine();
		quicksort(s,0,l-1);
		for(int i=0;i<l;i++)
		System.out.println(s[i]);
		
		
	}
	static void swap(String s[],int i,int j)
	{
		String temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}
	static void quicksort(String[] s, int left, int right) {
		// TODO Auto-generated method stub
		int i,j;String pivot;
		if(left<right)
		{ do {
		 i=left;
		j=right+1;
		 pivot=s[left];
			
				do {i++;if(i>right)break;}while(s[i].compareTo(pivot)<0);
				do {j--;if(j<=left)break;}while(s[j].compareTo(pivot)>0);
				if(i<j)
					swap(s,i,j);
					
			}
			while(i<j);
			swap(s,left,j);
			quicksort(s,left,j-1);
			quicksort(s,j+1,right);
			
		}
	}

}

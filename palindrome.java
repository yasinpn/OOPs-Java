package Lab;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String r="";
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			r+=s.charAt(i);
		}
		System.out.println("The reverse of "+s+" is "+r);
		sc.close();
	}

}

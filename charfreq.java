package Lab;
import java.util.Scanner;
class charfreq
{
    public static void main(String args[])
    { int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        int l=s.length();

                for(int i=0;i<l;i++)
                {
                    if(s.charAt(i)==ch)
                    count++;
                }
    System.out.println("The frequency is "+count);
 sc.close();
    }
}
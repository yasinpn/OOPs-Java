package Lab;
import java.util.*;
public class Stringtokenizer 
{
    public static void main(String args[]) {
        int sum = 0;
        StringBuffer sb=new StringBuffer("Halloween");
        sb.delete(0, 5 );
        System.out.print(sb);
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers one by one leaving a space");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
           int n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum of the integers is: " + sum);
        sc.close();	
    }
}
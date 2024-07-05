package Lab;
import java.util.Scanner;
class Areas
{
	public void area(double r)
	{
	double area=3.14*Math.pow(r, 2)	;
	System.out.println("Area of circle is "+area);
	}
	public void area(double l,double b)
	{
		double area=l*b;
		System.out.println("Area of Rectangle is "+area);
	}
	public void area(double a,double b ,double c)
	{	double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+area);
	}


}
public class overloader {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
Areas a=new Areas();
while(true)
{	System.out.println();
	System.out.println("THE MENU IS AS FOLLOWS");
	System.out.println();
	System.out.println("1.AREA OF CIRCLE");
	System.out.println("2.AREA OF RECTANGLE");
	System.out.println("3.AREA OF TRIANGLE");
	System.out.println("4.EXIT");
	System.out.println();
	System.out.println("Enter your choice");
    int op=sc.nextInt();
	switch(op)
	{
	case 1:		System.out.println("Enter the radius");
				double radius=sc.nextDouble();
				a.area(radius);
				break;
	case 2:		System.out.println("Enter the length and breadth");
				double l=sc.nextDouble();
				double b=sc.nextDouble();
				a.area(l, b);
				break;
	case 3:		System.out.println("Enter the 3 sides ");
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				double z=sc.nextDouble();
				a.area(x,y,z);
				break;
	case 4:     System.out.println("EXITING....");
				System.exit(0);
				
	}
}}}

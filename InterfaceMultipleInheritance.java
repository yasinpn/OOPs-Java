package Lab;
import java.util.Scanner;
interface Sports
{
	int sportWt=6;
	public void putWt();
}
class Student
{
	int rollno;
	public void getNumber(int n)
	{
		rollno=n;
	}
public void putNumber()
{
	System.out.println("Roll no is "+rollno);
}
}
class Test extends Student
{
	double part1,part2;
	public void getMarks(double a,double b)
	{
		part1=a;
		part2=b;
	}
	public void putMarks()
	{
		System.out.println("Part 1= "+part1+" Part 2= "+part2);
	}
}
class Results extends Test implements Sports
{
	public void putWt()
	{
		System.out.println("Sports Wt "+sportWt);
	}
	public void display() {
		double Total_Score;
		putNumber();
		System.out.println("Marks Obtained: ");
		putMarks();
		putWt();
		Total_Score=part1+part2+sportWt;
		System.out.println("\n Total Score"+Total_Score);
		             }}
		public class InterfaceMultipleInheritance
		{
		public static void main(String args[]) {
		double part1,part2;
		int roll;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number");
		roll=sc.nextInt();
		System.out.println("Enter part 1");
		part1=sc.nextDouble();
		System.out.println("Enter part 2");
		    part2=sc.nextDouble();
		Results s= new Results(); 
		s.getNumber(roll);
		s.getMarks(part1, part2);
		s.display();
		}
		}
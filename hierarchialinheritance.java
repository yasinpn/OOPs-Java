package Lab;
import java.util.Scanner;
class Employees
{
String name;
int age;
int phnumber;
String address;
int salary;
void print_salary()
{
	System.out.println("Salary is "+salary);
	
}}
class officer extends Employees
{
	String specialization;
}
class Manager extends Employees
{
	String department;

}
public class hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		officer e=new officer();
		System.out.println("Enter the details"); 
		System.out.println("Enter the name");
		e.name=sc.next();
		System.out.println("Enter the age");
		e.age=sc.nextInt();
		System.out.println("Enter the number"); 
		e.phnumber=sc.nextInt();
		System.out.println("Enter the address");
		e.address=sc.next();
		System.out.println("Enter the salary");
		e.salary=sc.nextInt();
		System.out.println("Enter the specialization");
		e.specialization=sc.next();
		Manager m= new Manager();
		System.out.print("Enter the details\n\n"); 
		System.out.println("Enter the name");
		m.name=sc.next();
		System.out.println("Enter the age");
		m.age=sc.nextInt();
		System.out.println("Enter the number");
		m.phnumber=sc.nextInt(); 
		System.out.println("Enter the address");
		m.address=sc.next();
		System.out.println("Enter the salary");
		m.salary=sc.nextInt(); 
		System.out.println("Enter the department");
		m.department=sc.next();
		System.out.println("Details of officer:");
		System.out.println("Name "+e.name+"\n"+"Age:"+e.age+"\n"+"Number: "+e.phnumber+"\n"+"Address:"+e.address+"\n"+"Specialization "+e.specialization);
				    e.print_salary();
				System.out.println("Name "+m.name+"\n"+"Age: "+m.age+"\n"+"Number: "+m.phnumber+"\n"+"Address: "+m.address+"\n"+"Specialization "+m.department);
				    m.print_salary();
				}
}

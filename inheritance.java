package Lab;
class Employee
{
public void display()
{
	System.out.println("The Name of the Class is Employee");
}
public void calcsalary()
{
	System.out.println("The Salary is 100000");
}
}
class Engineer extends Employee
{
	public void display()
	{
		System.out.println("The Name of the Class is Engineer");
	
	}
	public void calcsalary()
	{
		System.out.println("The Salary is 200000");
		super.display();
		super.calcsalary();
	}

}

public class inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Engineer e = new Engineer();
e.display();
e.calcsalary();

	}

}

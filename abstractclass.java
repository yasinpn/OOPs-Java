package Lab;
abstract class Shape
{
	abstract void numberofsides();
}
class Rectangle extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides of rectangle is 4");
	}
}
class Triangle extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides of triangle is 3");
	}
}
class Hexagon extends Shape
{
	void numberofsides()
	{
		System.out.println("The number of sides of hexagon is 6");
	}
}
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle();
				s.numberofsides();
		 s=new Triangle();
				s.numberofsides();
		 s=new Hexagon();
				s.numberofsides();

	}

}

package Lab;
import java.util.*;


class cube extends Thread
{
	int x;
	cube(int n)
	{
		x=n;
	}
	public void run()
	{
		System.out.println("Cube "+x+" = "+(Math.pow(x, 3)));
	}
}
class square extends Thread
{
	int x;
	square(int n)
	{
		x=n;
	}
	
	public void run()
	{
		System.out.println("Square of "+x+" = "+Math.pow(x, 2));
	}
}
class Number extends Thread
{
	synchronized void solve()
	{
		Random r=new Random();
		for(int i=0;i<5;i++) {
		int	n=r.nextInt(100);
		System.out.println("Random integer: "+n);
		if(n%2==0)
		{
			square s=new square(n);
			s.start();
			
	}
		else
		{
			cube c=new cube(n);
			c.start();
			
		}}
		try
		{
			Thread.sleep(100);}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }
		}
	public void run() {
	solve();}
		}
public class threadsqcube {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Number n=new Number();
		n.start();
	}}


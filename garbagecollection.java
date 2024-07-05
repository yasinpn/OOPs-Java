package Lab;
class Kill
{
	public void finalize()
	{
		System.out.println("Memory released");
		
	}
}
public class garbagecollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kill k1=new Kill();
k1=null;
Kill k2=new Kill();
k2=null;
	System.gc();
	}
}

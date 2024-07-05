package Lab;
import java.io.*;
public class filehandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String f1="/Users/ashil/Documents/file1.txt";
String f2="/Users/ashil/Documents/cpy.txt";
	try
	{
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);
	int c;
	while((c=fin.read())!=-1)
	{
		fout.write(c);
	}
	System.out.println("File Contents Copied"+f1+"succesfully to"+f2);
	fin.close();
	fout.close();
	    }
	catch(IOException e)
	    {
	    System.out.println(e.getMessage());
	}
	
	}

}

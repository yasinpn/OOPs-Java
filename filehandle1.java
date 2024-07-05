package Lab;
import java.io.*;
public class filehandle1 {
public static void main(String args[])
{
	int ch=0,w=0,l=0;
	String s;
	try
	{
		FileReader f=new FileReader("/Users/ashil/Documents/file1.txt");
		BufferedReader br=new BufferedReader(f);
		while((s=br.readLine())!=null)
		{
			l++;
			ch+=s.length();
			String words[]=s.split(" ");
			w+=words.length;
		}
	ch=ch-(w-l);
	f.close();
	System.out.println("No. of characters:"+ch); 
	System.out.println("No. of words:"+w);
	System.out.println("Number of lines"+l);
	}
	catch(FileNotFoundException e) {
	System.out.println("File not found"); }
	catch(IOException ie) {
	System.out.println(ie.getMessage()); 
	}}}

import java.util.*;
import java.io.*;
public class DL{
 Node head=null;
	
class Node
{
	int data;
	Node prev;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
public void insertatend(int data)
{
	Node n=new Node(data);
	if(head==null)
		head=n;
	else
	{
		Node ptr=head;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next=n;
		n.prev=ptr;
		System.out.println("Inserted "+n.data);
	}
}
public void deleteatfront()
{
	if(head==null)
	System.out.println("Empty");
	else
	{	int data=head.data;
		head=head.next;
		head.prev=null;
		System.out.println("Deleted "+data);
	}
}
public void display()
{
	if(head==null)
		System.out.println("Empty");
	else
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Doubly Linked List");
		int op,data;
		DL l=new DL();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("THE MENU IS:::");
			System.out.println("Enter 1 for insert\nEnter 2 for delete\nEnter 3 for display");
			op=sc.nextInt();
			switch(op)
			{
			case 1:System.out.println("Enter element to add");
					data=sc.nextInt();
					l.insertatend(data);
					break;
			case 2:
					l.deleteatfront();
					break;
			case 3:l.display();
					break;
			case 4:System.exit(0);
			}
		}
	}}


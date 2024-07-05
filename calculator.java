import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class n extends JFrame implements ActionListener
{double a=0.0,b=0.0;
int op=0;
	JButton jb1,jb0,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jbdec,jbmul,jbadd,jbsub,jbdiv,jbeq,jbclr;
	JTextField jt;
	JPanel jp;
	n()
	{ 
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("CALCULATOR");
		jb0=new JButton("0");
		jb1=new JButton("1");
		jb2=new JButton("2");
		jb3=new JButton("3");
		jb4=new JButton("4");
		jb5=new JButton("5");
		jb6=new JButton("6");
		jb7=new JButton("7");
		jb8=new JButton("8");
		jb9=new JButton("9");
		jbdec=new JButton(".");
		jbmul=new JButton("*");
		jbadd=new JButton("+");
		jbsub=new JButton("-");
		jbdiv=new JButton("/");
		jbeq=new JButton("=");
		jbclr=new JButton("clr");
		jt=new JTextField();
		
		add(jbclr);
		setVisible(true);
		setSize(300,400);
		jp=new JPanel();
		setLayout(null);
		jp.setLayout(new GridLayout(4,4));
		jp.add(jb0);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);
		jp.add(jb9);
		jp.add(jbeq);
		jp.add(jbmul);
		jp.add(jbadd);
		jp.add(jbsub);
		jp.add(jbdiv);
		jp.add(jbdec);
		add(jt);
		add(jp);
		jp.setBounds(50,100,200,200);
		
		jbclr.setBounds(125,300, 50, 50);

		jt.setBounds(100,25,100,50);
		jb0.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jbadd.addActionListener(this);
		jbsub.addActionListener(this);
		jbmul.addActionListener(this);
		jbdiv.addActionListener(this);
		jbclr.addActionListener(this);
		jbdec.addActionListener(this);
		jt.addActionListener(this);
		jbeq.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
	JButton j=new JButton();
	j=(JButton)e.getSource();
		if(j==jb0)
		{
			jt.setText(jt.getText().concat(jb0.getText()));
			
		}
		if(e.getSource()==jb1)
		{
			jt.setText(jt.getText().concat(jb1.getText()));
			
		}
		if(e.getSource()==jb2)
		{
			jt.setText(jt.getText().concat(jb2.getText()));
			
		}
		if(e.getSource()==jb3)
		{
			jt.setText(jt.getText().concat(jb3.getText()));
			
		}
		if(e.getSource()==jb4)
		{
			jt.setText(jt.getText().concat(jb4.getText()));
			
		}
		if(e.getSource()==jb5)
		{
			jt.setText(jt.getText().concat(jb5.getText()));
			
		}
		if(e.getSource()==jb6)
		{
			jt.setText(jt.getText().concat(jb6.getText()));
			
		}
		if(e.getSource()==jb7)
		{
			jt.setText(jt.getText().concat(jb7.getText()));
			
		}
		if(e.getSource()==jb8)
		{
			jt.setText(jt.getText().concat(jb8.getText()));
			
		}
		if(e.getSource()==jb9)
		{
			jt.setText(jt.getText().concat(jb9.getText()));
			
		}
		if(e.getSource()==jbadd)
		{
			a=Double.parseDouble(jt.getText());
			op=1;
			
			jt.setText("");
		}
		if(e.getSource()==jbsub)
		{
			a=Double.parseDouble(jt.getText());
			op=2;
			jt.setText("");
		}
		
		if(e.getSource()==jbmul)
		{
			a=Double.parseDouble(jt.getText());
			op=3;
			jt.setText("");
		}
		if(e.getSource()==jbdiv)
		{
			a=Double.parseDouble(jt.getText());
			op=4;
			jt.setText("");
		}
		if(e.getSource()==jbclr)
		{
			jt.setText("");
		}
		if(e.getSource()==jbdec)
		{	
			jt.setText(jt.getText().concat(jbdec.getText()));
			
		}
		if(e.getSource()==jbeq)
		{
			b=Double.parseDouble(jt.getText());
			System.out.println(op);
			switch(op)
			{
			case 1: jt.setText(String.valueOf(a+b));System.out.println("ABD");
						break;
			case 2: jt.setText(String.valueOf(a-b));
					break;
			case 3:jt.setText(String.valueOf(a*b));
					break;
			case 4:jt.setText(String.valueOf(a/b));
					break;
			}
		}
		
		
		
	}
}

public class calculator {

	public static void main(String[] args) {
	n c=new n();
	}

}

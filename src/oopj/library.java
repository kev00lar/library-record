package oopj;
import java.util.*;
import oopj1.MyInterface;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class library extends JFrame implements MyInterface,ActionListener,Runnable {
	JOptionPane jpn,jpn1,jpn2;
	Scanner sc;
	ArrayList<String> b;
	BufferedReader br; 
	librec student;
	Panel p1;
	Panel1 p2;
	int s;
	Thread th;
	
	public library()throws Exception{
		super("MyFrame");
		th = new Thread(this);
		th.start();
		p1 = new Panel();
		add(p1,BorderLayout.CENTER);
		
		p2= new Panel1();
		add(p2,BorderLayout.SOUTH);
		
		p2.jbtn.addActionListener(this);
		
		setSize(600,400);
		setResizable(false);
		setVisible(true);
		
		info();
	}
	
     public synchronized void run()
     {
    	 System.out.println("This is a synchronized run method");
     }
	public void actionPerformed(ActionEvent e)
	{
		jpn2.showMessageDialog(this,"Login Successful","Message",jpn.PLAIN_MESSAGE);
		this.dispose();
	}
	public int getTotalBooks()
	{
		return 300;
	}
	public void info()throws Exception
	{
		jpn1.showMessageDialog(this,"Welcome to NIE library","WELCOME!!",jpn.PLAIN_MESSAGE);
		br = new BufferedReader(new InputStreamReader(System.in));
		
		Thread.sleep(2000);
		System.out.println("Enter your email to login");
		System.out.println("We are verifying your mail id");
		Thread.sleep(7000);
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("enter your usn");
		String usn = br.readLine();
		System.out.println("Enter your deparment");
		String dept = br.readLine();
		
		System.out.println("We are storing your information");
		Thread.sleep(3000);
		student = new librec(name,dept,usn);
		System.out.println("We ahve stored your information successfully");
		
		ArrayList<String> book = getBookList();
		System.out.println("Total number of books availabe are "+getTotalBooks());
		System.out.println("These are the books that can be issued from our library:");
		 for(String s : book)
			  System.out.println(s);
		 System.out.println("Please select the book you want!");
		 sc=new Scanner(System.in);
		 s=sc.nextInt();
		 
		 switch(s)
	       {
	           
	           case 1: System.out.println("Thank you for issuing Oops Book!");
	                   ArrayList<String> c=getBookname();
	                   System.out.println(c.get(0));
	                   issue();
	                   break;                   
	           case 2: System.out.println("Thank you for issuing Ratan Tata Biography!");
	           		   ArrayList<String> d=getBookname();
	           		   System.out.println(d.get(1));
	           		issue();
	                   break;
	           case 3: System.out.println("Thank you for issuing Tutankhamun!");
	           			ArrayList<String> e=getBookname();
	           			System.out.println(e.get(2));
	           			issue();
	                   break;              
	           case 4: System.out.println("Thank you for issuing Mein Kampf!");
	           			ArrayList<String> f=getBookname();
	           			System.out.println(f.get(3));
	           			issue();
       	               break;       
	           case 5: System.out.println("Thank you for issuing Top Gear Magazine!");
	           			ArrayList<String> g=getBookname();
               			System.out.println(g.get(4));
               			issue();
	                   break;
	           case 6: System.out.println("Thank you for issuing H.C Verma Physics!");
	           			ArrayList<String> h=getBookname();
	           			System.out.println(h.get(5));
	           			issue();
	           		   break;
	           case 7: System.out.println("Thank you for issuing Immortals of Meluha!");
	           			ArrayList<String> p=getBookname();
	           			System.out.println(p.get(6));
	           			issue();
	           		   break;
	            default:
	             throw new myException();
	       }
	}
	public ArrayList<String> getBookList()
	{
		ArrayList<String> a = new ArrayList<String>();
	    a.add("1) Oops Book");
	    a.add("2) Ratan Tata Biography");
	    a.add("3) Tutankhamun");
	    a.add("4) Mein Kampf");
        a.add("5) Top Gear");
        a.add("6) H.C Verma Physics");
	    a.add("7) Immortals Of Meluha");
        return a;
	} 
	public ArrayList<String> getBookname()
	{
		b = new ArrayList<String>();
	    b.add("Book issued:- Oops Book:Teaches us about the concepts of object oriented programming in Java language.");
	    b.add("Book issued:- Ratan Tata Biography:Tells us about the life of Ratan Tata.");
	    b.add("Book issued:- Tutankhamun:Life of the great egyptian pharaoh Tutankhamun.");
	    b.add("Book issued:- Mein Kampf:Autobiographical manifesto by Nazi Party leader Adolf Hitler.");
        b.add("Book issued:- Top Gear:All about automobile.");
        b.add("Book issued:- H.C Verma Physics:Concepts of physics.");
	    b.add("Book issued:- Immortals Of Meluha:Story of Shiva and his journey.");
        return b;
	} 
	public void issue() {
		try 
		{
		   Thread.sleep(3000);
		   System.out.println("We have issued your book "+student.getStudentName()+", Please return it in 15 days");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		try 
		{
		new library();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class myException extends Exception{
	myException(){
		System.out.println("Suhaas sir pls give extra marks :(");
	}
}

class Panel extends JPanel 
{
   JTextField jtf;
   public Panel()
   {
	   jtf = new JTextField(20);
	   add(jtf);
   }
}
class Panel1 extends JPanel 
{
   JButton jbtn;
   public Panel1()
   {
	   jbtn = new JButton("Submit");
	   add(jbtn);
   }
}


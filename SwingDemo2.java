import javax.swing.*;
import java.awt.*;
class SwingDemo2
{
	SwingDemo2()
	{// Create a new JFrame container.
		JFrame f = new JFrame("A Simple Swing Application");
		// Give the frame an initial size.
		f.setSize(275, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton b=new JButton("click");
		JButton b1=new JButton("ok");
		JButton b2=new JButton("submit");
		JButton b3=new JButton("sub");
		JButton b4=new JButton("add");
		JButton b5=new JButton("+");
		//b.setBounds(600,300,60, 50);//x axis, y axis, width, height  
		//b1.setBounds(700,300,60, 50);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setLayout(new FlowLayout());
	}
	public static void main(String args[])
	{
		new SwingDemo2();
	}
}
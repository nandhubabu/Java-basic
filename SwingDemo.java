import javax.swing.*;
import java.awt.*;
class SwingDemo
{
SwingDemo()
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
f.add(b,BorderLayout.NORTH);
f.add(b1,BorderLayout.SOUTH);
f.add(b2,BorderLayout.EAST);
f.add(b3,BorderLayout.WEST);
f.add(b4,BorderLayout.CENTER);
}
public static void main(String args[])
{
	new SwingDemo();
}
}
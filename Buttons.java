import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
class Buttons extends JFrame implements ActionListener
{
	JButton b2;
        Buttons()
	{	
		b2 = new JButton("Login");
		add(b2);
		setLayout(null);
		b2.setBounds(200,200,100,60);
  		setSize(500,600);
		setTitle("Button Clicks");
		b2.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Button Clicked");
	}
	public static void main(String args[])
	{
		Buttons b=new Buttons();
	}
}

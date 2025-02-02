import javax.swing.*;
import java.awt.FlowLayout;
class SwingDemo1
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame("Login Page");
		jf.setSize(600,800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		JLabel jl=new JLabel("Username:");
		jf.add(jl);
		JTextField jt=new JTextField(20);
		jf.add(jt);
		JLabel jl1=new JLabel("Password:");
		jf.add(jl1);
		JTextField jt1=new JTextField(20);
		jf.add(jt1);
		JButton jb= new JButton("Login");
		jf.add(jb);
	}
}
	
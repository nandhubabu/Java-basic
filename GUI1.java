import javax.swing.JOptionPane;
class GUI1
{
	public static void main(String args[])
	{
		String fn=JOptionPane.showInputDialog("Enter the firstnumber");
		String sn=JOptionPane.showInputDialog("Enter the firstnumber");	
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum=num1+num2;
		JOptionPane.showMessageDialog(null,"The answer is"+sum,"sum",JOptionPane.PLAIN_MESSAGE);
	}
}	
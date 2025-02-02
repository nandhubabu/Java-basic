import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calansa implements ActionListener{

	JFrame jf;
	JTextField t;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton badd,bsub,bmul,bpc;
	JButton beq,bdel,bdec,bcl;

	int a=0,b=0,val=0;
	int operator=0;

	calansa(){

		jf = new JFrame("Calculator");

		t = new JTextField("");

		b0 = new JButton("0");
		b1 = new JButton("1");

		badd = new JButton("+");
		beq = new JButton("=");	
				
		t.setBounds(30,40,280,30);
		
		b0.setBounds(110,310,50,40);
		b1.setBounds(40,240,50,40);
		beq.setBounds(180,310,50,40);
		badd.setBounds(250,310,50,40);
		
		
		jf.add(t);

		jf.add(b0);
		jf.add(b1);

		jf.add(badd);
		jf.add(beq);
		
		jf.setLayout(null);
		jf.getContentPane().setBackground(Color.BLACK);

		
		jf.setVisible(true);
		jf.setSize(360,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b0.addActionListener(this);
		b1.addActionListener(this);

		badd.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == b0)
		   t.setText(t.getText().concat("0"));
		if(ae.getSource() == b1)
		   t.setText(t.getText().concat("1"));

		if(ae.getSource() == badd){
			a=Integer.parseInt(t.getText());
			operator=1;
			t.setText("");
		}
if(ae.getSource() == beq){
			b=Integer.parseInt(t.getText());
			t.setText("");
			switch(operator){
				case 1 : val = a+b;
						t.setText(""+val);
				         break;
					}
		}
}
public static void main(String args[]){
		new calansa();
	}
}
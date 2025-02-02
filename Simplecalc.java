
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Simplecalc implements ActionListener{

	JFrame jf;
	JTextField t;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton badd,bsub,bmul,bpc;
	JButton beq,bdel,bdec,bcl;

	double a=0,b=0,val=0;
	int operator=0;

	Simplecalc(){

		jf = new JFrame("Calculator");

		t = new JTextField("");

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bpc = new JButton("/");
		
		beq = new JButton("=");
		bdel = new JButton("Delete");
		bdec = new JButton(".");
		bcl = new JButton("Clear");
		
		t.setBounds(30,40,280,30);

		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		bpc.setBounds(250,100,50,40);
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		bmul.setBounds(250,170,50,40);
		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		bsub.setBounds(250,240,50,40);
		bdec.setBounds(40,310,50,40);
		b0.setBounds(110,310,50,40);
		beq.setBounds(180,310,50,40);
		badd.setBounds(250,310,50,40);
		bdel.setBounds(60,380,100,40);
		bcl.setBounds(180,380,100,40);
		
		jf.add(t);

		jf.add(b0);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		
		jf.add(badd);
		jf.add(bsub);
		jf.add(bmul);
		jf.add(bpc);
		jf.add(beq);
		jf.add(bdel);
		jf.add(bdec);
		jf.add(bcl);

		jf.setLayout(null);
		//jf.getContentPane().setBackground(Color.WHITE);

		jf.setVisible(true);
		jf.setSize(360,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bpc.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bdec.addActionListener(this);
		bcl.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == b0)
		   t.setText(t.getText().concat("0"));
		if(ae.getSource() == b1)
		   t.setText(t.getText().concat("1"));
		if(ae.getSource() == b2)
		   t.setText(t.getText().concat("2"));
		if(ae.getSource() == b3)
		   t.setText(t.getText().concat("3"));
		if(ae.getSource() == b4)
		   t.setText(t.getText().concat("4"));
		if(ae.getSource() == b5)
		   t.setText(t.getText().concat("5"));
		if(ae.getSource() == b6)
		   t.setText(t.getText().concat("6"));
		if(ae.getSource() == b7)
		   t.setText(t.getText().concat("7"));
		if(ae.getSource() == b8)
		   t.setText(t.getText().concat("8"));
		if(ae.getSource() == b9)
		   t.setText(t.getText().concat("9"));

		if(ae.getSource() == bdec)
		   t.setText(t.getText().concat("."));
		
		if(ae.getSource() == badd){
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		}

		if(ae.getSource() == bsub){
			a=Integer.parseInt(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(ae.getSource() == bmul){
			a=Integer.parseInt(t.getText());
			operator=3;
			t.setText("");
		}

		if(ae.getSource() == bpc){
			a=Integer.parseInt(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(ae.getSource() == bcl){
			t.setText("");
		}

		if(ae.getSource() == bdel){
			String s= t.getText();
			t.setText("");
			for(int i =0; i<s.length()-1;i++){
				t.setText(t.getText()+s.charAt(i));
			}
		}


		if(ae.getSource() == beq){
			b=Double.parseDouble(t.getText());
			t.setText("");
			switch(operator){
				case 1 : val = a+b;
						t.setText(""+val);
				         break;
				case 2 : val = a-b;
						t.setText(""+val);
				         break;
				case 3 : val = a*b;
						t.setText(""+val);
				         break;
				case 4 : try{
				            val = a/b;
				            t.setText(""+val);
				         }
				        
				         catch(ArithmeticException e)
				         {
				         	t.setText("Division by 0 not possible");
				         					         }
				         break;
				default : val =b;
			}
			//t.setText(""+val);
		}

	}

	public static void main(String args[]){
		new Simplecalc();
	}
}

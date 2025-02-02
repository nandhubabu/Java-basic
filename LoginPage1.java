import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.*;

public class LoginPage1{

    public static void main(String[] args) {
        JFrame jf;
        JLabel l1,l2;
        JTextField t1,t2;
        JButton b;

       // Color yellow = new Color(255, 209, 102);
       
        

        jf=new JFrame("LOGIN PAGE");

        jf.setLayout(null);
        jf.setBounds(50,100,300,400);
        jf.setVisible(true);
        //jf.getContentPane().setBackground();
        jf.setResizable(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Username");
        l1.setBounds(30,100,100,30);
        jf.add(l1);

        t1=new JTextField();
        t1.setBounds(100,105,100,20);
        jf.add(t1);

        l2=new JLabel("Password");
        l2.setBounds(30,150,100,30);
        jf.add(l2);

        t2=new JTextField();
        t2.setBounds(100,155,100,20);
        jf.add(t2); 
         
        b=new JButton("Login");
        b.setBounds(100,200,100,20);
        b.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                String Username = t1.getText();
                String Password = t2.getText();
                if(Username.trim().equals("Nandhu") && Password.trim().equals("0123")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
        jf.add(b);
    }
}

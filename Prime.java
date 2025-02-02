import javax.swing.*;
//import java.awt.event.*;
import java.awt.*;

public class Prime extends JFrame 
{
    private Container c;
    private JLabel l;
   // private JTextField t;
   // private JButton b;

    public Prime()
    {
        setTitle("Odd or even finder");
        setBounds(300,90,400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        l= new JLabel();
        l.setBounds(100,30,150,30);
        c.add(l);
    }
    
}
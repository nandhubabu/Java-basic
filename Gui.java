import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Gui extends JFrame 
{
    private Container c;
    private JLabel l;
    private JTextField t;
    private JButton b,d;

    public Gui()
    {
        setTitle("Odd or even finder");
        setBounds(300,90,400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);

        l= new JLabel("Enter the Number ");
        l.setBounds(50,30,125,30);
        c.add(l);

        t = new JTextField();
        t.setBounds(160,30,160,30);
        c.add(t);

        b = new JButton("Check");
        b.setBounds(75,88,100,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try
                {
                    int n =Integer.parseInt(t.getText());
                    if(n%2==0)
                    {
                        t.setText("It is even");
                    }
                    else if (n%2==1) {
                        t.setText("it is odd");
                    }
                }
                catch(Exception v)
                {
                    t.setText("Enter valid number");
                }
            }
        });
        c.add(b);

        d = new JButton("clear");
        d.setBounds(180,88,100,30);
        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText("");
            }
        });
        c.add(d);
    }

   
    public static void main(String[] args) {
        new Gui();
    }
    
}
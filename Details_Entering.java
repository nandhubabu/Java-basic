import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details_Entering {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Details");
        JLabel l1 = new JLabel("NAME");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("AGE");
        JTextField t2 = new JTextField();
        JLabel l3 = new JLabel("DOB");
        JTextField t3 = new JTextField();
        JButton b1 = new JButton("Next");

        jf.setLayout(null);
        jf.setSize(400,500);
        jf.setVisible(true);

        l1.setBounds(100,100,100,50);
        jf.add(l1);

        t1.setBounds(150,115,100,20);
        jf.add(t1);

        l2.setBounds(100,150,100,50);
        jf.add(l2);

        t2.setBounds(150,165,100,20);
        jf.add(t2);

        l3.setBounds(100,200,100,50);
        jf.add(l3);

        t3.setBounds(150,215,100,20);
        jf.add(t3);

        b1.setBounds(150,275,100,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!t1.getText().isEmpty() && !t2.getText().isEmpty() && !t3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jf,"Thanks for the Details");
                }
                else{
                    JOptionPane.showMessageDialog(jf,"Please Enter the Details");
                }
            }
        });
        jf.add(b1);
    }
}

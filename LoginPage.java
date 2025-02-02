import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private Container container;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;

    public LoginPage() {
        setTitle("Login Form");
        setBounds(300, 90, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(50, 30, 100, 30);
        container.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 30, 150, 30);
        container.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 75, 100, 30);
        container.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(150, 75, 150, 30);
        container.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 120, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = userText.getText();
                String password = passwordText.getText();
                if (userName.trim().equals("admin") && password.trim().equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });
        container.add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

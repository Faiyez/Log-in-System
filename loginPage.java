import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginPage extends JFrame implements ActionListener, java.awt.event.ActionListener{
//    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField idField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel loginLabel = new JLabel("Login");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    loginPage(HashMap<String, String> realLoginInfo){
        loginInfo = realLoginInfo;
        loginLabel.setBounds(50,100,80,20);
        passwordLabel.setBounds(50,150,80,20);
        messageLabel.setBounds(100,250,200,40);
        messageLabel.setFont(new Font(null,Font.BOLD,20));
        idField.setBounds(120,100,200,20);
        passwordField.setBounds(120,150,200,20);
        loginButton.setBounds(140,200,80,20);
        loginButton.addActionListener(this);
        resetButton.setBounds(220,200,80,20);
        resetButton.addActionListener(this);

        add(resetButton);
        add(loginButton);
        add(passwordField);
        add(idField);
        add(messageLabel);
        add(loginLabel);
        add(passwordLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setVisible(true);        
    }


    public void actionPerformed(ActionEvent e){

    }
}

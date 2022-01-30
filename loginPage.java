import java.util.HashMap;

import javax.swing.*;

import org.w3c.dom.UserDataHandler;

import java.awt.*;
import java.awt.event.*;

public class loginPage extends JFrame implements ActionListener{
//    JFrame frame = new JFrame();
    JButton logIn = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField idField = new JTextField();
    JPasswordField passWordField = new JPasswordField();
    JLabel loginLabel = new JLabel("Login");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel("This is a test");
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    loginPage(HashMap<String, String> realLoginInfo){
        loginInfo = realLoginInfo;
        loginLabel.setBounds(50,100,80,20);
        passwordLabel.setBounds(50,150,80,20);
        messageLabel.setBounds(100,250,200,40);
        messageLabel.setFont(new Font(null,Font.BOLD,20));
        
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

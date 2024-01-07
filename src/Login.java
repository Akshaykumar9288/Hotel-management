import javax.swing.*;
import java.awt.*;

public class Login {

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel("Username:");
        JLabel jLabel1 = new JLabel("Password");
        JButton jButton = new JButton("Login");
        JButton jButton1 = new JButton("Cancel");
        JLabel jLabel2;
        //ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\images.png"));
        JTextField jTextField = new JTextField();
        JTextField jTextField1 = new JTextField();
        Login(){
        jLabel2 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\images.png"));
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jLabel1);
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jButton.setBounds(40,140,120,30);
        jButton1.setBounds(180,140,120,30);
        jTextField1.setBounds(150,70,150,30);
        jTextField.setBounds(150,20,150,30);
        jLabel1.setBounds(40,70,100,30);
        jLabel.setBounds(40,20,100,30);
        jFrame.setLayout(null);
        jFrame.setSize(600,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
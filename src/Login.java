
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Login extends JFrame{

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel("Username:");
        JLabel jLabel1 = new JLabel("Password");
        JButton jButton = new JButton("Login");
        JButton jButton1 = new JButton("Cancel");
        JLabel jLabel2 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\images.png"));
        JTextField jTextField = new JTextField();
        JTextField jTextField1 = new JTextField();
        JLabel jLabel3 = new JLabel();
        Login(){
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jLabel1);
        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jLabel2);
        jFrame.add(jLabel3);
        jButton.setBounds(40,140,120,30);
        jButton1.setBounds(180,140,120,30);
        jButton.setBackground(Color.cyan);
        jButton1.setBackground(Color.cyan);
        jTextField1.setBounds(150,70,150,30);
        jLabel3.setBounds(150,90,150,30);
        jTextField.setBounds(150,20,150,30);
        jLabel1.setBounds(40,70,100,30);
        jLabel.setBounds(40,20,100,30);
        jLabel2.setBounds(390,5,150,170);
        jFrame.setLayout(null);
        jFrame.setSize(600,300);
        jFrame.setVisible(true);
        jFrame.setLocation(600,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jButton.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        try{
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                                Statement stm = conn.createStatement();
                                String username = jTextField.getText();
                                String password = jTextField1.getText();
                                ResultSet res = stm.executeQuery("select * from hotel where username ='"+username+"'"+" and password ='"+password+"'");

                                if (res.next()){
                                        dispose();
                                        new Dashboard();
                                }else {
                                        jLabel3.setText("Something is Wrong");
                                }

                        }catch (Exception e1){
                                System.out.println("Error is:"+e1);
                        }
                }
        });
        jButton1.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        jTextField.setText("");
                        jTextField1.setText("");
                }
        });

    }

        public static void main(String[] args) {
                new Login();
        }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.jar.JarEntry;

public class Update_Room extends JFrame {
    JLabel jLabel = new JLabel("Update Room Status");
    JLabel jLabel1 = new JLabel("Guest ID:");
    Choice choice = new Choice();
    JLabel jLabel2 = new JLabel("Availability:");
    JLabel jLabel3 = new JLabel("Clean Status:");
    JLabel jLabel4 = new JLabel("Room Number:");
    private JLabel jTextField = new JLabel("A");
    private JTextField jTextField1 = new JTextField("C");
    private JTextField jTextField2 = new JTextField("R");
    JButton jButton = new JButton("Check");
    JButton jButton1 = new JButton("Update");
    JButton jButton2 = new JButton("Back");
    JLabel jLabel5 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\luxury-classic-modern-bedroom-suite-hotel_105762-1787.jpg"));
    Update_Room(){
        add(jLabel);
        add(jLabel1);
        add(choice);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jTextField);
        add(jTextField1);
        add(jTextField2);
        add(jButton);
        add(jButton1);
        add(jButton2);
        add(jLabel5);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(85, 11, 206, 34);
        jLabel1.setBounds(27, 87, 90, 14);
        choice.setBounds(160, 84, 140, 20);
        jLabel2.setBounds(27, 187, 90, 14);
        jLabel3.setBounds(27, 240, 90, 14);
        jTextField.setBounds(160, 184, 140, 20);
        jTextField1.setBounds(160, 237, 140, 20);
        jLabel4.setBounds(27, 133, 100, 14);
        jTextField2.setBounds(160, 130, 140, 20);
        jButton.setBounds(120, 315, 89, 23);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBounds(60, 355, 89, 23);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jButton2.setBounds(180, 355, 89, 23);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.white);
        jLabel5.setBounds(330,50,550,250);
        setLayout(null);
        setSize(930,450);
        setVisible(true);
        setLocation(400,150);

        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
            Statement stm = conn.createStatement();

            ResultSet resultSet = stm.executeQuery("select * from New_Customer ");
            while (resultSet.next()){
                choice.add(resultSet.getString("Number"));
            }
        }catch (Exception e1){
            System.out.println("Error is: "+e1);
        }
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    String num = choice.getSelectedItem();
                    BigInteger Number = new BigInteger(num);
                    ResultSet resultSet = stm.executeQuery("select * from New_Customer where Number = "+Number);
                    while (resultSet.next()){
                        jTextField2.setText(resultSet.getString("Allocated"));
                    }

                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
                int Room = Integer.parseInt(jTextField2.getText());
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery("select * from Rooms where Room_Number = "+Room);
                    while (resultSet.next()){
                        jTextField.setText(resultSet.getString("Available"));
                        jTextField1.setText(resultSet.getString("CleaningStatus"));
                    }
                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
            }
        });

        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int Room1 = Integer.parseInt(jTextField2.getText());
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
                    Statement stm = conn.createStatement();

                    String clean = jTextField1.getText();
                    String num = choice.getSelectedItem();
                    BigInteger Number = new BigInteger(num);
                    int resultSet = stm.executeUpdate("update Rooms set CleaningStatus ='"+clean+"' where Room_Number = "+Integer.parseInt(jTextField2.getText()));
                    if (resultSet==1){
                        JOptionPane.showMessageDialog(null,"Update Successfully");
                    }else{
                        JOptionPane.showMessageDialog(null,"Update fail");
                    }

                }catch (Exception e1){
                    System.out.println(e1);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Update_Room();
    }
}
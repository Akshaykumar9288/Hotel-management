import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Update_Check extends JFrame {
    JLabel jLabel = new JLabel("Update Status");
    JLabel jLabel1 = new JLabel("ID:");
    Choice choice = new Choice();
    JLabel jLabel2 = new JLabel("Room Number:");
    JTextField jTextField = new JTextField("Room");
    JLabel jLabel3 = new JLabel("Name:");
    JLabel jLabel4 = new JLabel("Amount Paid:");
    JLabel jLabel5 = new JLabel("Pending Amount:");
    JTextField jTextField1 = new JTextField("Name");
    JTextField jTextField2 = new JTextField("Paid");
    JLabel jTextField3 = new JLabel("pending");
    JButton jButton = new JButton("Update");
    JButton jButton1 = new JButton("Back");
    JButton jButton2 = new JButton("Check");
    JLabel jLabel7 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\download (4).jpeg"));
    Update_Check(){
        add(jLabel);
        add(jLabel1);
        add(choice);
        add(jLabel2);
        add(jTextField);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jTextField1);
        add(jTextField2);
        add(jTextField3);
        add(jButton);
        add(jButton1);
        add(jButton2);
        add(jLabel7);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(124, 11, 222, 25);
        jLabel1.setBounds(25, 88, 46, 14);
        choice.setBounds(248, 85, 140, 20);
        jLabel2.setBounds(25, 129, 107, 14);
        jTextField.setBounds(248, 126, 140, 20);
        jLabel3.setBounds(25, 174, 97, 14);
        jLabel4.setBounds(25, 216, 107, 14);
        jLabel5.setBounds(25, 261, 107, 14);
        jTextField1.setBounds(248, 171, 140, 20);
        jTextField2.setBounds(248, 216, 140, 20);
        jTextField3.setBounds(248, 258, 140, 20);
       jButton.setBounds(168, 378, 89, 23);
       jButton.setBackground(Color.BLACK);
       jButton.setForeground(Color.white);
       jButton1.setForeground(Color.white);
       jButton1.setBackground(Color.BLACK);
       jButton1.setBounds(281, 378, 89, 23);
       jButton2.setBounds(56, 378, 89, 23);
       jButton2.setBackground(Color.BLACK);
       jButton2.setForeground(Color.white);
       jLabel7.setBounds(300,60,476,270);
        setLayout(null);
        setSize(700,500);
        setVisible(true);
        setLocation(400,150);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from New_Customer");
            while (resultSet.next()){
                choice.add(resultSet.getString("Number"));
            }
        }catch (Exception e1){
            System.out.println("Error is: "+e1);
        }

        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery("select * from New_Customer where Number = "+choice.getSelectedItem());
                    while (resultSet.next()){
                        jTextField.setText(resultSet.getString("Allocated"));
                        jTextField1.setText(resultSet.getString("Name"));
                        jTextField2.setText(resultSet.getString("Deposit"));
                    }
                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
                try{
                    int Room = Integer.parseInt(jTextField.getText());
                    int paid = Integer.parseInt(jTextField2.getText());
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery("Select * from Rooms where Room_Number = "+Room);
                    while (resultSet.next()){
                        int total = Integer.parseInt(resultSet.getString("Price"));
                        int pending = total - paid;
                        jTextField3.setText(Integer.toString(pending));
                    }
                }catch (Exception e1){

                }
            }
        });
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    int Room = Integer.parseInt(jTextField.getText());
                    int paid = Integer.parseInt(jTextField2.getText());
                    ResultSet resultSet = stm.executeQuery("select * from Rooms where Room_NUmber = "+Room);
                    while (resultSet.next()){
                        if (paid>resultSet.getInt("Price")){
                            JOptionPane.showMessageDialog(null,"Plz pay suffient Balance");
                        }else {

                                int pending = Integer.parseInt(jTextField3.getText());
                                paid = Integer.parseInt(jTextField2.getText());
                                Room = Integer.parseInt(jTextField.getText());
                                ResultSet resultSet1 = stm.executeQuery("select * from New_Customer where Allocated = "+Room);
                                while (resultSet1.next()){
                                    if (pending == 0){
                                        JOptionPane.showMessageDialog(null,"No Pending Amount");
                                    } else {
                                        int result = stm.executeUpdate("update New_Customer set Deposit = Deposit + "+paid+" where Allocated = "+Room);
                                        if (result==1){
                                            JOptionPane.showMessageDialog(null,"Update Successfully");
                                        }else {
                                            JOptionPane.showMessageDialog(null,"Update fail");
                                        }
                                    }
                                }

                        }
                    }
                }catch (Exception e1){
                    System.out.println("Error is:"+e1);
                }


            }
        });
    }
    public static void main(String[] args) {
        new Update_Check();
    }
}
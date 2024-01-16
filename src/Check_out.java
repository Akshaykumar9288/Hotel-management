import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Check_out extends JFrame{
    JLabel jLabel = new JLabel("Check out");
    JLabel jLabel1 = new JLabel("Customer ID:");
    JLabel jLabel2 = new JLabel("Room Number");
    Choice choice = new Choice();
    JButton jButton = new JButton("Check out");
    JButton jButton1 = new JButton("Back");
    JButton jButton2 = new JButton("Check");
    JLabel jLabel3 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\download (2).jpeg"));
    JLabel jLabel4 = new JLabel();
    Check_out(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(choice);
        add(jButton);
        add(jButton1);
        add(jLabel3);
        add(jLabel4);
        add(jButton2);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(70, 11, 140, 35);
        jLabel1.setBounds(20, 85, 80, 14);
        jLabel2.setBounds(20, 132, 86, 20);
        choice.setBounds(130, 82, 150, 20);
        jLabel4.setBounds(130,132,150,20);
        jButton.setBounds(50, 200, 100, 25);
        jButton2.setBounds(110,230,100,25);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.white);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBounds(160, 200, 100, 25);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jLabel3.setBounds(200,0,500,225);
        setLayout(null);
        setSize(650,299);
        setVisible(true);
        setLocation(400,150);
        try{
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
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery("select * from New_Customer where Number ="+choice.getSelectedItem());
                    while (resultSet.next()){
                        jLabel4.setText(resultSet.getString("Allocated"));
                    }

                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
            }
        });

        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                    Statement stm = conn.createStatement();
                    int result = stm.executeUpdate("update Rooms set Available = 'Available' where Room_Number = "+jLabel4.getText());
                    if (result==1){
                        JOptionPane.showMessageDialog(null,"Check-Out Done");
                    }else{
                        JOptionPane.showMessageDialog(null,"Check-out fail");
                    }
                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Check_out();
    }
}

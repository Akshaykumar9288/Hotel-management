import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class New_Customer extends JFrame{
    JLabel jLabel = new JLabel("New Customer Form");
    JLabel jLabel1 = new JLabel("ID");
    JComboBox jComboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
    JLabel jLabel2 = new JLabel("Number :");
    JTextField jTextField = new JTextField();
    JLabel jLabel3 = new JLabel("Name :");
    JTextField jTextField1 = new JTextField();
    JLabel jLabel4 = new JLabel("Gender :");
    JRadioButton jRadioButton = new JRadioButton("Male");
    JRadioButton jRadioButton1 = new JRadioButton("Female");
    ButtonGroup buttonGroup = new ButtonGroup();
    JLabel jLabel5 = new JLabel("Country :");
    JTextField jTextField2 = new JTextField();
    JLabel jLabel6 = new JLabel("Allocated Room Number :");
    Choice choice = new Choice();
    JButton jButton = new JButton("Add Customer");
    JButton jButton1 = new JButton("Back");
    JLabel jLabel7 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\download (3).jpeg"));
    JLabel jLabel8 = new JLabel("Deposit");
    JTextField jTextField3 = new JTextField();
    New_Customer(){
        add(jLabel);
        add(jLabel1);
        add(jComboBox);
        add(jLabel2);
        add(jTextField);
        add(jLabel3);
        add(jTextField1);
        add(jLabel4);
        add(jRadioButton);
        add(jRadioButton1);
        add(jLabel5);
        add(jTextField2);
        add(jLabel6);
        add(choice);
        add(jButton);
        add(jButton1);
        add(jLabel7);
        add(jLabel8);
        add(jTextField3);
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        jLabel.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        jLabel.setBounds(118, 11, 260, 53);
        jLabel1.setBounds(35, 76, 200, 14);
        jComboBox.setBounds(271, 73, 150, 20);
        jLabel2.setBounds(35, 111, 200, 14);
        jTextField.setBounds(271, 111, 150, 20);
        jLabel3.setBounds(35, 151, 200, 14);
        jTextField1.setBounds(271, 151, 150, 20);
        jLabel4.setBounds(35, 191, 200, 14);
        jRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        jRadioButton.setBounds(271, 191, 80, 12);
        jRadioButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        jRadioButton1.setBounds(350, 191, 100, 12);
        jLabel5.setBounds(35, 231, 200, 14);
        jTextField2.setBounds(271, 231, 150, 20);
        jLabel6.setBounds(35, 274, 200, 14);
        choice.setBounds(271, 279, 150, 20);
        jButton.setBounds(100, 350, 120, 30);
        jButton1.setBounds(300, 350, 120, 30);
        jLabel8.setBounds(35, 310, 200, 14);
        jTextField3.setBounds(271,310,150,20);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jLabel7.setBounds(460,-70,300,500);
        jRadioButton.setActionCommand("Male");
        jRadioButton1.setActionCommand("Female");
        setLayout(null);
        setSize(800, 450);
        setVisible(true);
        setLocation(500,100);
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
            ResultSet resultSet = stm.executeQuery("select * from Rooms where Available = 'Available'");
            while (resultSet.next()){
                choice.add(resultSet.getString("Room_Number"));
            }
        }catch (Exception e1){
            System.out.println("Error is:"+e1);
        }
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField.getText().isBlank()||jTextField1.getText().isBlank()||jTextField2.getText().isBlank()||(jRadioButton.isSelected()==false&&jRadioButton1.isSelected()==false)||jTextField.getText().matches("[a-zA-Z]+")||jTextField1.getText().matches("^\\d*$")||jTextField2.getText().matches("^\\d*$")||jTextField3.getText().isBlank()||jTextField3.getText().matches("[a-zA-Z]+")){
                    JOptionPane.showMessageDialog(null,"Plz enter Correct Information\nAnd Fill All Information");
                }else {
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                        Statement stm = conn.createStatement();

                        String ID = (String) jComboBox.getSelectedItem();
                        String num = jTextField.getText();
                        BigInteger Number = new BigInteger(num);
                        String Name = jTextField1.getText();
                        String Gender = buttonGroup.getSelection().getActionCommand();
                        String Country = jTextField2.getText();
                        String Allocate = (String)choice.getSelectedItem();
                        int Allocation = Integer.parseInt(Allocate);
                        int Deposit = Integer.parseInt(jTextField3.getText());
                        int result = stm.executeUpdate("insert into New_Customer (ID, Number, Name, Gender, Country, Allocated, Deposit) values ('"+ID+"',"+Number+",'"+Name+"','"+Gender+"','"+Country+"','"+Allocation+"',"+Deposit+")");
                        int result1 = stm.executeUpdate("update Rooms set Available = 'Occupied' where Room_Number = "+Allocation);
                       if (result==1){
                           JOptionPane.showMessageDialog(null,"Customer Added");
                       }else {
                           JOptionPane.showMessageDialog(null,"Added Fail");
                       }
                    }catch (Exception e1){
                        System.out.println("Error is: "+e1);
                    }
                }
            }
        });

    }
    public static void main(String[] args) {
        new New_Customer();
    }
}

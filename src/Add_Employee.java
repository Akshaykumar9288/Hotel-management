import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Add_Employee extends JFrame {
    JLabel jLabel = new JLabel("Name");
    JLabel jLabel1 = new JLabel("Age");
    JLabel jLabel2 = new JLabel("Gender");
    JLabel jLabel3 = new JLabel("Job");
    JLabel jLabel4 = new JLabel("Salary");
    JLabel jLabel5 = new JLabel("Phone");
    JLabel jLabel6 = new JLabel("Aadhar");
    JLabel jLabel7 = new JLabel("Email");
    JLabel jLabel8 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\360_F_249058233_0MIaTy9WXtKHF0eacUSg9c3hkV9ehIbX.jpg"));
    JTextField jTextField = new JTextField();
    JTextField jTextField1 = new JTextField();
    JRadioButton jRadioButton2 = new JRadioButton("Male");
    JRadioButton jRadioButton_2 = new JRadioButton("Female");
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    ButtonGroup buttonGroup = new ButtonGroup();
    String job[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
    JComboBox jTextField3 = new JComboBox(job);
    JTextField jTextField7 = new JTextField();
    JButton jButton = new JButton("Submit");
    boolean isSelected2 = jRadioButton2.isSelected();
    boolean isSelected_2 = jRadioButton_2.isSelected();

    Add_Employee(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jRadioButton2);
        add(jRadioButton_2);
        add(jTextField);
        add(jTextField1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton_2);
        add(jTextField3);
        add(jTextField4);
        add(jTextField5);
        add(jTextField6);
        add(jTextField7);
        add(jLabel8);
        add(jButton);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel.setBounds(60, 30, 150, 27);
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel1.setBounds(60, 80, 150, 27);
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel2.setBounds(60, 120, 150, 27);
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel3.setBounds(60, 170, 150, 27);
        jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel4.setBounds(60, 220, 150, 27);
        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel5.setBounds(60, 270, 150, 27);
        jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel6.setBounds(60, 320, 150, 27);
        jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jLabel7.setBounds(60, 370, 150, 27);
        jTextField.setBounds(200, 30, 150, 27);
        jTextField1.setBounds(200, 80, 150, 27);
        jRadioButton2.setBounds(200, 120, 70, 27);
        jRadioButton_2.setBounds(280, 120, 70, 27);
        jTextField3.setBackground(Color.white);
        jTextField3.setBounds(200,170,150,30);
        jTextField4.setBounds(200, 220, 150, 27);
        jTextField5.setBounds(200, 270, 150, 27);
        jTextField6.setBounds(200, 320, 150, 27);
        jTextField7.setBounds(200, 370, 150, 27);
        jLabel8.setBounds(370,10,400,410);
        jButton.setBounds(200, 420, 150, 30);
        jRadioButton2.setActionCommand("Male");
        jRadioButton_2.setActionCommand("Female");
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        setLayout(null);
        setSize(800,500);
        setVisible(true);
        setLocation(600,100);

        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField.getText().isBlank()||jTextField1.getText().isBlank()||jTextField4.getText().isBlank()||jTextField5.getText().isBlank()||jTextField6.getText().isBlank()||jTextField7.getText().isBlank()||jTextField5.getText().matches("[a-zA-Z]+")||jTextField5.getText().length()>10||jTextField5.getText().length()<10||(jRadioButton2.isSelected()==false&&jRadioButton_2.isSelected()==false)||jTextField7.getText().matches("[a-zA-Z0-9. _%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")==false||jTextField4.getText().matches("[a-zA-Z]+")||jTextField1.getText().matches("[a-zA-Z]+")||jTextField6.getText().matches("[a-zA-Z]+")||jTextField6.getText().length()>10||jTextField6.getText().length()<10||jTextField.getText().matches("^\\d*$")){
                    JOptionPane.showMessageDialog(null,"Plz enter Correct Information\nAnd Fill All Information");
                }else {
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
                        Statement stm = conn.createStatement();
                        String name = jTextField.getText();
                        int age = Integer.parseInt(jTextField1.getText());
                        String gender = buttonGroup.getSelection().getActionCommand();
                        String job = (String) jTextField3.getSelectedItem();
                        int Salary = Integer.parseInt(jTextField4.getText());
                        String phone1 = jTextField5.getText();
                        BigInteger phone = new BigInteger(phone1);
                        String Aadhar1 = jTextField6.getText();
                        BigInteger Aadhar = new BigInteger(Aadhar1);
                        String Email = jTextField7.getText();
                        System.out.println(phone);
                        System.out.println(Aadhar);
                        int result = stm.executeUpdate("insert into Employee (Name, Age, Gender, Job, Salary, Phone, Aadhar, Email) values ('"+name+"',"+age+",'"+gender+"','"+job+"',"+Salary+","+phone+","+Aadhar+",'"+Email+"')");
                        if (result==1){
                            JOptionPane.showMessageDialog(null,"New Employee Added");
                        }else {
                            JOptionPane.showMessageDialog(null,"Employee Added is Fail");
                        }
                    }catch (Exception e1){
                        System.out.println("Error is:"+e1);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Add_Employee();
    }
}

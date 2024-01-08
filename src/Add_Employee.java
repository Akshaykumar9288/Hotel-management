import javax.swing.*;
import java.awt.*;

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
    JTextField jTextField = new JTextField("NAme");
    JTextField jTextField1 = new JTextField("Age");
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
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        setLayout(null);
        setSize(800,500);
        setVisible(true);
        setLocation(600,100);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Add_Employee();
    }
}

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class AddRoom extends JFrame{
    JLabel jLabel = new JLabel("Add Rooms");
    JLabel jLabel1 = new JLabel("Room Number");
    JLabel jLabel2 = new JLabel("Available");
    JLabel jLabel3 = new JLabel("Cleaning status");
    private JTextField jTextField = new JTextField();
    private JTextField jTextField1 = new JTextField();
    private JComboBox comboBox = new JComboBox(new String[] {"Available","Occupied"});
    private JComboBox comboBox1 = new JComboBox(new String[] {"Cleaned","Dirty"});
    private JComboBox comboBox2 = new JComboBox(new String[] {"Single Bed","Double Bed"});
    JLabel jLabel4 = new JLabel("Price");
    JLabel jLabel5 = new JLabel("Bed Type");
    JButton jButton = new JButton("Add");
    JButton jButton1 = new JButton("Back");
    JLabel jLabel6 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\photo-1631049421450-348ccd7f8949.jpg"));
    AddRoom(){
        add(jLabel);
        add(jLabel1);
        add(jTextField);
        add(jLabel2);
        add(comboBox);
        add(jLabel3);
        add(jLabel4);
        add(comboBox1);
        add(jTextField1);
        add(jLabel5);
        add(comboBox2);
        add(jButton);
        add(jButton1);
        add(jLabel6);
        jLabel.setBounds(194, 10, 120, 22);
        jLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel1.setForeground(new Color(25,25,112));
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel1.setBounds(64, 70, 104, 22);
        jTextField.setBounds(174, 70, 156, 20);
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2.setForeground(new Color(25, 25, 112));
        jLabel2.setBounds(64, 110, 102, 22);
        jLabel3.setForeground(new Color(25,25,112));
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3.setBounds(59, 150, 112, 22);
        comboBox.setBounds(176, 110, 154, 20);
        comboBox1.setBounds(176, 150, 154, 20);
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setForeground(new Color(25, 25, 112));
        jLabel4.setBounds(64, 190, 102, 22);
        jTextField1.setBounds(174, 190, 156, 20);
        jLabel5.setBounds(64, 230, 102, 22);
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel5.setForeground(new Color(25, 25, 112));
        comboBox2.setBounds(176, 230, 154, 20);
        jButton.setBounds(64, 321, 111, 33);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jButton1.setBounds(198, 321, 111, 33);
        jLabel6.setBounds(400,20,500,370);
        setLayout(null);
        setSize(1000,450);
        setVisible(true);
        setLocation(400,150);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new AddRoom();
    }
}

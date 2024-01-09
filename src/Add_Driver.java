import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Add_Driver extends JFrame{
    JLabel jLabel = new JLabel("Add Diver");
    JLabel jLabel1 = new JLabel("Name");
    JLabel jLabel2 = new JLabel("Age");
    JLabel jLabel3 = new JLabel("Gender");
    JLabel jLabel4 = new JLabel("Car Company");
    JLabel jLabel5 = new JLabel("Car Brand");
    JLabel jLabel6 = new JLabel("Available");
    JLabel jLabel7 = new JLabel("Location");
    JTextField jTextField = new JTextField();
    JTextField jTextField1 = new JTextField();
    JComboBox jComboBox = new JComboBox(new String [] {"Male","Female"});
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JComboBox jComboBox1 = new JComboBox(new String [] {"Yes","No"});
    JTextField jTextField4 = new JTextField();
    JButton jButton = new JButton("Add");
    JButton jButton1 = new JButton("Back");
    JLabel jLabel8 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\pngtree-tourists-talking-with-taxi-drivers-outside-the-church-image_871426.jpg"));

    Add_Driver(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jTextField);
        add(jTextField1);
        add(jComboBox);
        add(jTextField2);
        add(jTextField3);
        add(jComboBox1);
        add(jTextField4);
        add(jButton);
        add(jButton1);
        add(jLabel8);
        jLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        jLabel.setBounds(194, 10, 120, 22);
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel1.setForeground(new Color(25, 25, 112));
        jLabel1.setBounds(64, 70, 102, 22);
        jTextField.setBounds(174, 70, 156, 20);
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2.setForeground(new Color(25, 25, 112));
        jLabel2.setBounds(64, 110, 102, 22);
        jTextField1.setBounds(174, 110, 156, 20);
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3.setForeground(new Color(25, 25, 112));
        jLabel3.setBounds(64, 150, 102, 22);
        jComboBox.setBounds(176, 150, 154, 20);
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setForeground(new Color(25, 25, 112));
        jLabel4.setBounds(64, 190, 102, 22);
        jTextField2.setBounds(174, 190, 156, 20);
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel5.setForeground(new Color(25, 25, 112));
        jLabel5.setBounds(64, 230, 102, 22);
        jTextField3.setBounds(174, 230, 156, 20);
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel6.setForeground(new Color(25, 25, 112));
        jLabel6.setBounds(64, 270, 102, 22);
        jComboBox1.setBounds(176, 270, 154, 20);
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel7.setForeground(new Color(25, 25, 112));
        jLabel7.setBounds(64, 310, 102, 22);
        jTextField4.setBounds(174, 310, 156, 20);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton.setBounds(64, 380, 111, 33);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jButton1.setBounds(198, 380, 111, 33);
        jLabel8.setBounds(400,30,500,370);
        setLayout(null);
        setSize(1000,500);
        setVisible(true);
        setLocation(400,100);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new Add_Driver();
    }
}

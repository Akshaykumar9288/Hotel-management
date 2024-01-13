import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.jar.JarEntry;

public class Update_Room extends JFrame {
    JLabel jLabel = new JLabel("Update Room Status");
    JLabel jLabel1 = new JLabel("Guest ID:");
    Choice choice = new Choice();
    JLabel jLabel2 = new JLabel("Availability:");
    JLabel jLabel3 = new JLabel("Clean Status:");
    JLabel jLabel4 = new JLabel("Room Number:");
    private JTextField jTextField = new JTextField();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
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
    }
    public static void main(String[] args) {
        new Update_Room();
    }
}
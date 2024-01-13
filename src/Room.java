import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Room extends JFrame {
    private JLabel jLabel = new JLabel("Room Number");
    private JLabel jLabel1 = new JLabel("Availability");
    private JLabel jLabel2 = new JLabel("Clean Status");
    private JLabel jLabel3 = new JLabel("Price");
    private JLabel jLabel4 = new JLabel("Bed Type");
     JButton jButton = new JButton("Back");
      private JTable jTable = new JTable();
    private JLabel jLabel5 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Pictures\\luxury-classic-modern-bedroom-suite-hotel_105762-1787.jpg"));
    Room(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jButton);
        add(jLabel5);
        add(jTable);
        jLabel.setBounds(12,15,90,14);
        jLabel1.setBounds(119, 15, 69, 14);
        jLabel2.setBounds(216, 15, 76, 14);
        jLabel3.setBounds(330, 15, 46, 14);
        jLabel4.setBounds(417, 15, 76, 14);
        jButton.setBounds(100, 470, 120, 30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jLabel5.setBounds(510,-48,560,600);
        jTable.setBounds(0, 40, 500, 400);
        setLayout(null);
        setSize(1100,600);
        setVisible(true);
        setLocation(200,100);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
    }
    public static void main(String[] args) {
        new Room();
    }
}

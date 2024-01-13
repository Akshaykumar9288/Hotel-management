import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Customer_Info extends JFrame {
    private JLabel jLabel = new JLabel("Document");
    private JLabel jLabel1 = new JLabel("Number");
    private JLabel jLabel2 = new JLabel("Name");
    private JLabel jLabel3 = new JLabel("Gender");
    JLabel jLabel4 = new JLabel("Country");
    JLabel jLabel5 = new JLabel("Room Number");
    JLabel jLabel6 = new JLabel("Deposit");
   // JLabel jLabel7 = new JLabel("Gmail");
    private JTable jTable = new JTable();
    JButton jButton = new JButton("Back");
    Customer_Info(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jButton);
        add(jTable);
        jLabel.setBounds(41, 11, 64, 14);
        jLabel1.setBounds(159, 11, 46, 14);
        jLabel2.setBounds(273, 11, 46, 14);
        jLabel3.setBounds(416, 11, 86, 14);
        jLabel4.setBounds(536, 11, 86, 14);
        jLabel5.setBounds(656, 11, 86, 14);
        jLabel6.setBounds(786, 11, 86, 14);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton.setBounds(350, 500, 120, 30);
        jTable.setBounds(0, 40, 900, 450);
        setLayout(null);
        setSize(900,600);
        setVisible(true);
        setLocation(400,100);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
    }
    public static void main(String[] args) {
        new Customer_Info();
    }
}

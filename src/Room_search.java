import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Room_search extends JFrame{
    JLabel jLabel = new JLabel("Search For Room");
    JLabel jLabel1 = new JLabel("Room Bed Type:");
    JLabel jLabel2 = new JLabel("Room Number");
    JLabel jLabel3 = new JLabel("Availability");
    JLabel jLabel4 = new JLabel("Price");
    JLabel jLabel5 = new JLabel("Bed Type");
    JLabel jLabel6 = new JLabel("Cleaning Status");
    JButton jButton = new JButton("Submit");
    JButton jButton1 = new JButton("Back");
    JCheckBox jComboBox = new JCheckBox("Only Display Available");
    Choice c1 = new Choice();
    JTable jTable = new JTable();
    Room_search(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jComboBox);
        add(jButton);
        add(jButton1);
        add(c1);
        add(jLabel6);
        add(jTable);
        c1.add("Single Bed");
        c1.add("Double Bed");
        jButton.setBounds(200, 400, 120, 30);
        jButton1.setBounds(380, 400, 120, 30);
        jLabel6.setBounds(306, 162, 96, 14);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        c1.setBounds(153, 70, 120, 20);
        jComboBox.setBounds(400, 69, 205, 23);
        jLabel5.setBounds(580, 162, 96, 14);
        jLabel4.setBounds(458, 162, 46, 14);
        jLabel3.setBounds(175, 162, 120, 14);
        jLabel2.setBounds(23, 162, 96, 14);
        jLabel1.setBounds(50, 73, 96, 14);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(250, 11, 186, 31);
        jTable.setBounds(0, 187, 700, 207);
        setLayout(null);
        setSize(700, 500);
        setVisible(true);
        setLocation(600,200);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
    }
    public static void main(String[] args) {
        new Room_search();
    }
}

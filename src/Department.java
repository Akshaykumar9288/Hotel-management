import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Department extends JFrame {
    JTable jTable = new JTable();
    JButton jButton = new JButton("Load Data");
    JLabel jLabel = new JLabel("Department");
    JLabel jLabel1 = new JLabel("Budget");
    JButton jButton1 = new JButton("Back");
    Department(){
        add(jTable);
        add(jButton);
        add(jLabel);
        add(jLabel1);
        add(jButton1);
        jTable.setBounds(0, 40, 700, 350);
        jButton.setBounds(170, 410, 120, 30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jLabel.setBounds(145, 11, 105, 14);
        jLabel1.setBounds(431, 11, 75, 14);
        jButton1.setBounds(400, 410, 120, 30);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        setLayout(null);
        setSize(700,500);
        setVisible(true);
        setLocation(600,150);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
    }
    public static void main(String[] args) {
        new Department();
    }
}
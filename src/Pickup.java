import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Pickup extends JFrame {
     JLabel jLabel = new JLabel("PickUp Service");
     JLabel jLabel1 = new JLabel("Type of car");
     JLabel jLabel2 = new JLabel("Name");
     JLabel jLabel3 = new JLabel("Age");
    JLabel jLabel4 = new JLabel("Gender");
    JLabel jLabel5 = new JLabel("Company");
    JLabel jLabel6 = new JLabel("Brand");
    JLabel jLabel7 = new JLabel("Available");
    JLabel jLabel8 = new JLabel("Location");
    private JTable jTable = new JTable();
    JButton jButton = new JButton("Back");
    JButton jButton1 = new JButton("Submit");
    Choice choice = new Choice();
    Pickup(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jButton);
        add(jButton1);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jLabel8);
        add(choice);
        add(jTable);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(310, 20, 158, 25);
        jLabel1.setBounds(32, 97, 89, 14);
        jLabel2.setBounds(24, 208, 46, 14);
        jButton.setBounds(420, 500, 120, 30);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBounds(200, 500, 120, 30);
        jButton1.setForeground(Color.white);
        jButton1.setBackground(Color.BLACK);
        jLabel3.setBounds(165, 208, 46, 15);
        jLabel4.setBounds(264, 208, 46, 14);
        jLabel5.setBounds(366, 208, 80, 14);
        jLabel6.setBounds(486, 208, 105, 14);
        jLabel7.setBounds(600, 208, 86, 14);
        jLabel8.setBounds(700, 208, 73, 14);
        choice.setBounds(123, 94, 150, 25);
        jTable.setBounds(0, 233, 800, 250);
        setLayout(null);
        setSize(800,600);
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
        new Pickup();
    }
}

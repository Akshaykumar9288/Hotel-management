import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Check_out extends JFrame{
    JLabel jLabel = new JLabel("Check out");
    JLabel jLabel1 = new JLabel("Customer ID:");
    JLabel jLabel2 = new JLabel("Room Number");
    Choice choice = new Choice();
    JButton jButton = new JButton("Check out");
    JButton jButton1 = new JButton("Back");
    JLabel jLabel3 = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\download (2).jpeg"));
    Check_out(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(choice);
        add(jButton);
        add(jButton1);
        add(jLabel3);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabel.setBounds(70, 11, 140, 35);
        jLabel1.setBounds(20, 85, 80, 14);
        jLabel2.setBounds(20, 132, 86, 20);
        choice.setBounds(130, 82, 150, 20);
        jButton.setBounds(50, 200, 100, 25);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton1.setBounds(160, 200, 100, 25);
        jButton1.setBounds(160, 200, 100, 25);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.white);
        jLabel3.setBounds(200,0,500,225);
        setLayout(null);
        setSize(650,294);
        setVisible(true);
        setLocation(400,150);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });

    }
    public static void main(String[] args) {
        new Check_out();
    }
}

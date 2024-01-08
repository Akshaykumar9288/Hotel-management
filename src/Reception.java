import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Reception extends JFrame{
    JButton jButton = new JButton("New Customer Form");
    JButton jButton1 = new JButton("Room");
    JButton jButton2 = new JButton("Department");
    JButton jButton3 = new JButton("All Employee Info");
    JButton jButton4 = new JButton("Customer Info");
    JButton jButton5 = new JButton("Manager Info");
    JButton jButton6 = new JButton("Check out");
    JButton jButton7 = new JButton("Update status");
    JButton jButton8 = new JButton("Update Room Status");
    JButton jButton9 = new JButton("Pickup Service");
    JButton jButton10 = new JButton("Search Room");
    JButton jButton11 = new JButton("Logout");
    JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\istockphoto-1164435677-612x612.jpg"));
  public Reception(){

      add(jButton);
      add(jButton1);
      add(jButton2);
      add(jButton3);
      add(jButton4);
      add(jButton5);
      add(jButton6);
      add(jButton7);
      add(jButton8);
      add(jButton9);
      add(jButton10);
      add(jButton11);
      add(jLabel);
      jLabel.setBounds(230,-90,340,700);
      jButton.setBounds(10, 30, 200, 30);
      jButton.setBackground(Color.BLACK);
      jButton.setForeground(Color.white);
      jButton1.setBounds(10, 70, 200, 30);
      jButton1.setBackground(Color.black);
      jButton1.setForeground(Color.white);
      jButton2.setBounds(10, 110, 200, 30);
      jButton2.setBackground(Color.BLACK);
      jButton2.setForeground(Color.white);
      jButton3.setBounds(10, 150, 200, 30);
      jButton3.setBackground(Color.BLACK);
      jButton3.setForeground(Color.white);
      jButton4.setBounds(10, 190, 200, 30);
      jButton4.setBackground(Color.black);
      jButton4.setForeground(Color.white);
      jButton5.setBounds(10, 230, 200, 30);
      jButton5.setBackground(Color.BLACK);
      jButton5.setForeground(Color.white);
      jButton6.setBounds(10, 270, 200, 30);
      jButton6.setBackground(Color.black);
      jButton6.setForeground(Color.white);
      jButton7.setBounds(10, 310, 200, 30);
      jButton7.setBackground(Color.BLACK);
      jButton7.setForeground(Color.white);
      jButton8.setBounds(10, 350, 200, 30);
      jButton8.setBackground(Color.black);
      jButton8.setForeground(Color.white);
      jButton9.setBounds(10, 390, 200, 30);
      jButton9.setBackground(Color.BLACK);
      jButton9.setForeground(Color.white);
      jButton10.setBounds(10, 430, 200, 30);
      jButton10.setBackground(Color.black);
      jButton10.setForeground(Color.white);
      jButton11.setBounds(10, 470, 200, 30);
      jButton11.setBackground(Color.black);
      jButton11.setForeground(Color.white);
      setLayout(null);
      setSize(600,600);
      setVisible(true);
      setLocation(600,150);
     // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Reception();
    }
}

import javax.swing.*;

import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class Main extends JFrame {
    JFrame jFrame = new JFrame();
     JLabel jLabel;
    JButton jButton = new JButton("Next");
    JLabel jLabel1 = new JLabel("Hotel Management System");
    Main(){
        jLabel = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\Downloads\\439191 (1).jpg"));
        jFrame.add(jLabel1);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jLabel1.setBounds(20,655,1200,128);
        jLabel1.setFont(new Font("serif",Font.PLAIN,110));
        jLabel1.setForeground(Color.white);
        jButton.setBounds(1300,680,150,50);
        jButton.setBackground(Color.white);
        jButton.setForeground(Color.black);
        jLabel.setHorizontalAlignment(CENTER);
        jLabel.setVerticalAlignment(CENTER);

        jFrame.pack();
        jFrame.setLayout(null);
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        while(true){
            jLabel1.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){}
            jLabel1.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}
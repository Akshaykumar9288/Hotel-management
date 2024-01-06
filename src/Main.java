import javax.swing.*;

import static javax.swing.SwingConstants.CENTER;

public class Main extends JFrame {
    JFrame jFrame = new JFrame();
     JLabel jLabel;
    JButton jButton = new JButton();
    Main(){

        jLabel = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\Downloads\\439191 (1).jpg"));
        jLabel.setHorizontalAlignment(CENTER);
        jLabel.setVerticalAlignment(CENTER);
        jFrame.add(jLabel);
        jFrame.pack();
        jFrame.setLayout(null);
        jFrame.setSize(1000,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Main m = new Main();
    }
}
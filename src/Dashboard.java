import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame{

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\Akshay Kumar\\OneDrive\\Desktop\\the-breakers-pool_HERO_FLPOOL0822-c7d42242e0af41c0bde21cf5b0c3992b.jpg"));
        JMenu jMenu = new JMenu("Hotel Management");
        JMenu jMenu1 = new JMenu("Admin");
        JMenuItem jMenuItem = new JMenuItem("Reception");
        JMenuItem jMenuItem1 = new JMenuItem("Add Employee");
        JMenuItem jMenuItem2 = new JMenuItem("Add Rooms");
        JMenuItem jMenuItem3 = new JMenuItem("Add Drivers");
        Dashboard() {
                jMenu.add(jMenuItem);
                jMenu1.add(jMenuItem1);
                jMenu1.add(jMenuItem2);
                jMenu1.add(jMenuItem3);
                JMenuBar jMenuBar = new JMenuBar();
                jFrame.setJMenuBar(jMenuBar);
                jMenu.setForeground(Color.blue);
                jMenu1.setForeground(Color.red);
                jMenuBar.add(jMenu);
                jMenuBar.add(jMenu1);
                jFrame.add(jLabel);
                jFrame.pack();
                jFrame.setLayout(null);
                jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                jMenuItem.addActionListener(new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new Reception();
                        }
                });
                jMenuItem2.addActionListener(new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new AddRoom();
                        }
                });
                jMenuItem1.addActionListener(new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new Add_Employee();
                        }
                });
                jMenuItem3.addActionListener(new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new Add_Driver();
                        }
                });


        }

        public static void main(String[] args) {
                new Dashboard();
        }
}

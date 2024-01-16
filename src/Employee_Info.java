import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Employee_Info extends JFrame {
    private JLabel jLabel = new JLabel("Name");
    private JLabel jLabel1 = new JLabel("Age");
    private JLabel jLabel2 = new JLabel("Gender");
    private JLabel jLabel3 = new JLabel("Department");
    JLabel jLabel4 = new JLabel("Salary");
    JLabel jLabel5 = new JLabel("Phone");
    JLabel jLabel6 = new JLabel("Aadhar");
    JLabel jLabel7 = new JLabel("Gmail");
    private JTable jTable = new JTable();
    JButton jButton = new JButton("Back");
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    Employee_Info(){
        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jButton);
        add(jTable);
        jLabel.setBounds(41, 11, 46, 14);
        jLabel1.setBounds(159, 11, 46, 14);
        jLabel2.setBounds(273, 11, 46, 14);
        jLabel3.setBounds(416, 11, 86, 14);
        jLabel4.setBounds(536, 11, 86, 14);
        jLabel5.setBounds(656, 11, 86, 14);
        jLabel6.setBounds(786, 11, 86, 14);
        jLabel7.setBounds(896, 11, 86, 14);
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.white);
        jButton.setBounds(350, 500, 120, 30);
        jTable.setBounds(0, 34, 1000, 450);
        setLayout(null);
        setSize(1020,600);
        setVisible(true);
        setLocation(400,100);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from Employee");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columCount = resultSetMetaData.getColumnCount();
            for (int i = 1; i <=columCount;i++){
                defaultTableModel.addColumn(resultSetMetaData.getColumnName(i));
            }
            while (resultSet.next()){
                Object [] row = new Object[columCount];
                for (int i = 1; i <= columCount; i++){
                    row[i-1] = resultSet.getObject(i);
                }
                defaultTableModel.addRow(row);
            }
            jTable.setModel(defaultTableModel);
        }catch (Exception e1){

        }
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Reception();
            }
        });
    }
    public static void main(String[] args) {
        new Employee_Info();
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.Vector;

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
    DefaultTableModel defaultTableModel = new DefaultTableModel();
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
        jTable.setModel(defaultTableModel);
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
        jComboBox.setActionCommand("Available");
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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from Rooms");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columCount = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= columCount; i++) {
                defaultTableModel.addColumn(resultSetMetaData.getColumnName(i));
            }
            while (resultSet.next()) {
                Object[] row = new Object[columCount];
                for (int i = 1; i <= columCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                defaultTableModel.addRow(row);
            }
            jTable.setModel(defaultTableModel);
        }catch (Exception e1){
            System.out.println("Error is: "+e1);
        }
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Bed_Type = c1.getSelectedItem();
                String SQL = "select * from Rooms where Bed_type = '"+Bed_Type+"'";
                String SQL1 = "select * from Rooms where Bed_type = '"+Bed_Type+"' and Available = '"+jComboBox.getActionCommand()+"'";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery(SQL);
                    if (jComboBox.isSelected()){
                        resultSet = stm.executeQuery(SQL1);

                    }
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    int columCount = resultSetMetaData.getColumnCount();
                    String [] Update = new String[columCount];
                    for (int i = 1; i <= columCount; i++) {
                        defaultTableModel.addColumn(resultSetMetaData.getColumnName(i));
                    }
                    defaultTableModel.setColumnIdentifiers(Update);
                    defaultTableModel.setRowCount(0);
                    while (resultSet.next()) {
                        Object[] row = new Object[columCount];
                        for (int i = 1; i <= columCount; i++) {
                            row[i - 1] = resultSet.getObject(i);
                        }
                        defaultTableModel.addRow(row);
                    }
                    jTable.setModel(defaultTableModel);
                }catch (Exception e1){
                    System.out.println("Error is: "+e1);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Room_search();
    }
}

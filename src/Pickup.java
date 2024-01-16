import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

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
    DefaultTableModel defaultTableModel = new DefaultTableModel();
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

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","AK_shay2666");
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from Add_Driver");
            while (resultSet.next()){
                choice.add(resultSet.getString("Car_Brand"));
            }
        }catch (Exception e1){
            System.out.println("Error is: "+e1);
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery("select * from Add_Driver");
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
               dispose();
               new Reception();
           }
       });
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Brand = choice.getSelectedItem();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "AK_shay2666");
                    Statement stm = conn.createStatement();
                    ResultSet resultSet = stm.executeQuery("select * from Add_Driver where Car_Brand = '"+Brand+"'");
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
        new Pickup();
    }
}

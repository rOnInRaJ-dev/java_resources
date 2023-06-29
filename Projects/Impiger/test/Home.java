
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JFrame {
    
    static int time = 200;
    
    int currentRow = 0;

    PreparedStatement pst;
    Statement statement;
    ResultSet rs;
    Connection connection = null;
    String SQL;
    
    
    public Home() {
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        
        
        initComponents();
        
        createBt.setOpaque(false);
        createBt.setContentAreaFilled(false);
        createBt.setBorderPainted(false);
        
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        
        refreshBt.setOpaque(false);
        refreshBt.setContentAreaFilled(false);
        refreshBt.setBorderPainted(false);
        
        editBt.setOpaque(false);
        editBt.setContentAreaFilled(false);
        editBt.setBorderPainted(false);
        
        deleteBt.setOpaque(false);
        deleteBt.setContentAreaFilled(false);
        deleteBt.setBorderPainted(false);
        
        doConnect();
        updateTable();
        
        
        internTable.getTableHeader().setFont(new Font("Tahome",Font.BOLD,50));
        
        internTable.getTableHeader().setForeground(Color.WHITE);
        
        internTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        internTable.getTableHeader().setReorderingAllowed(false);
        
        internTable.setBackground(new Color(0,130,153));
       
        dateSearch.setEnabled(false);
        jButton1.setEnabled(false);
    }
    
    
    public void doConnect(){
        try {
            
            String host = "jdbc:mysql://localhost:3306/impigerinternapp";
            String userName = "root";
            String password = "";
        
            connection = DriverManager.getConnection(host, userName, password);
            
            SQL = "SELECT * FROM `internreport` ";
            
        }catch(SQLException error){
            System.out.println(error.getMessage());
            
        }
    }
    
    
    void updateTable(){
        
        
        try{
            pst = connection.prepareStatement(SQL);
            rs = pst.executeQuery();
            internTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        createBt = new javax.swing.JButton();
        refreshBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        internTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        editBt = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        institutionsearch = new javax.swing.JRadioButton();
        datesearchchoose = new javax.swing.JRadioButton();
        namesearch = new javax.swing.JRadioButton();
        searchField = new javax.swing.JTextField();
        gendersearch = new javax.swing.JRadioButton();
        dateSearch = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Impiger Internship");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 109, 181));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        createBt.setBackground(new java.awt.Color(255, 255, 255));
        createBt.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        createBt.setForeground(new java.awt.Color(255, 255, 255));
        createBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-user-male-50.png"))); // NOI18N
        createBt.setText("Add");
        createBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createBt.setIconTextGap(10);
        createBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtActionPerformed(evt);
            }
        });

        refreshBt.setBackground(new java.awt.Color(255, 255, 255));
        refreshBt.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        refreshBt.setForeground(new java.awt.Color(255, 255, 255));
        refreshBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Entypo_d83d(0)_64.png"))); // NOI18N
        refreshBt.setText("Refresh");
        refreshBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshBt.setIconTextGap(-5);
        refreshBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtActionPerformed(evt);
            }
        });

        internTable.setAutoCreateRowSorter(true);
        internTable.setBackground(new java.awt.Color(0, 102, 182));
        internTable.setFont(new java.awt.Font("Gidole", 0, 24)); // NOI18N
        internTable.setForeground(new java.awt.Color(255, 255, 255));
        internTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        internTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        internTable.setFillsViewportHeight(true);
        internTable.setGridColor(new java.awt.Color(0, 109, 181));
        internTable.setMinimumSize(getMinimumSize());
        internTable.setRowHeight(75);
        internTable.setRowMargin(3);
        internTable.getTableHeader().setReorderingAllowed(false);
        internTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                internTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(internTable);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Impigertech-logo-500-blue.jpg"))); // NOI18N

        editBt.setBackground(new java.awt.Color(0, 109, 181));
        editBt.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        editBt.setForeground(new java.awt.Color(255, 255, 255));
        editBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit-profile-50.png"))); // NOI18N
        editBt.setText("Edit");
        editBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editBt.setIconTextGap(5);
        editBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtActionPerformed(evt);
            }
        });

        deleteBt.setBackground(new java.awt.Color(0, 109, 181));
        deleteBt.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        deleteBt.setForeground(new java.awt.Color(255, 255, 255));
        deleteBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-bin-50.png"))); // NOI18N
        deleteBt.setText("Delete");
        deleteBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteBt.setIconTextGap(5);
        deleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 109, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Raleway", 1, 30), new java.awt.Color(255, 255, 255))); // NOI18N

        institutionsearch.setBackground(new java.awt.Color(0, 100, 155));
        buttonGroup1.add(institutionsearch);
        institutionsearch.setFont(new java.awt.Font("Raleway", 0, 30)); // NOI18N
        institutionsearch.setForeground(new java.awt.Color(255, 255, 255));
        institutionsearch.setText("Education Institution");

        datesearchchoose.setBackground(new java.awt.Color(0, 100, 155));
        buttonGroup1.add(datesearchchoose);
        datesearchchoose.setFont(new java.awt.Font("Raleway", 0, 30)); // NOI18N
        datesearchchoose.setForeground(new java.awt.Color(255, 255, 255));
        datesearchchoose.setText("Start Date");
        datesearchchoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datesearchchooseActionPerformed(evt);
            }
        });

        namesearch.setBackground(new java.awt.Color(0, 100, 155));
        buttonGroup1.add(namesearch);
        namesearch.setFont(new java.awt.Font("Raleway", 0, 30)); // NOI18N
        namesearch.setForeground(new java.awt.Color(255, 255, 255));
        namesearch.setSelected(true);
        namesearch.setText("Name");

        searchField.setBackground(new java.awt.Color(0, 109, 181));
        searchField.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
        searchField.setForeground(new java.awt.Color(255, 255, 255));
        searchField.setText(" Search...");
        searchField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        gendersearch.setBackground(new java.awt.Color(0, 100, 155));
        buttonGroup1.add(gendersearch);
        gendersearch.setFont(new java.awt.Font("Raleway", 0, 30)); // NOI18N
        gendersearch.setForeground(new java.awt.Color(255, 255, 255));
        gendersearch.setText("Gender");

        dateSearch.setBackground(new java.awt.Color(0, 109, 181));
        dateSearch.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        dateSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateSearchMouseClicked(evt);
            }
        });

        jButton1.setAction(jButton1.getAction());
        jButton1.setBackground(new java.awt.Color(0, 109, 181));
        jButton1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(namesearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(datesearchchoose)
                        .addGap(29, 29, 29)
                        .addComponent(dateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(gendersearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(institutionsearch)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(dateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(namesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datesearchchoose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(gendersearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(institutionsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(createBt)
                .addGap(108, 108, 108)
                .addComponent(editBt)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(deleteBt)
                        .addGap(68, 68, 68)
                        .addComponent(refreshBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editBt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteBt)
                                .addComponent(refreshBt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        dateSearch.setEnabled(false);
        searchField.setEnabled(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            java.util.Date sDate = dateSearch.getDate();

            java.sql.Date startDate = convertUtilToSql(sDate);

            String query = "SELECT * FROM `internreport` WHERE `Start Date` = '"+startDate+"'";

            pst = connection.prepareStatement(SQL);
            rs = pst.executeQuery(query);
            internTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dateSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateSearchMouseClicked
        try {

            String query = "SELECT * from internreport WHERE ";

            java.sql.Date startDate = convertUtilToSql(dateSearch.getDate());
            JOptionPane.showMessageDialog(this, startDate);
            query += "Start Date LIKE '%" + startDate + "%'";

            pst = connection.prepareStatement(query);
            pst.execute();

            updateTable();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateSearchMouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased

        try {

            String query = "SELECT * from internreport WHERE ";
            if(namesearch.isSelected()){
                query += "Name LIKE '%" +searchField.getText() + "%'";
            }else if(gendersearch.isSelected()){
                query += "Gender REGEXP '^" +searchField.getText() + "'";
            }else if(institutionsearch.isSelected()){
                query += "Institution LIKE '%" +searchField.getText() + "%'";
            }

            pst = connection.prepareStatement(SQL);
            rs = pst.executeQuery(query);
            internTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText(null);
    }//GEN-LAST:event_searchFieldMouseClicked

    private void datesearchchooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datesearchchooseActionPerformed

        dateSearch.setEnabled(true);
        searchField.setEnabled(false);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_datesearchchooseActionPerformed

    private void deleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtActionPerformed

        
        
                
                
        JLabel lb = new JLabel("Are you sure you want to delete this entry?");
        lb.setFont(new Font("Raleway", Font.PLAIN, 18));
                
        int input = JOptionPane.showConfirmDialog(this, lb,"Delete Entry", JOptionPane.YES_NO_OPTION);

        if(input == 0){

            try{

                int[] row = internTable.getSelectedRows();
                
                for (int i = 0; i < row.length; i++) {
                    
                    String id = internTable.getModel().getValueAt(row[i], 5).toString();
                    String query = " Delete from internreport where Email='" + id +"';";

                    pst = connection.prepareStatement(query);
                    pst.execute();
                }
                setVisible(false);

                 Home home = new Home();
                home.setVisible(true);
            }
            catch(Exception e){
                JLabel la = new JLabel((Icon) e);
                la.setFont(new Font("Raleway", Font.PLAIN, 18));
                JOptionPane.showMessageDialog(null, la);
            }
        }
    }//GEN-LAST:event_deleteBtActionPerformed

    private void editBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtActionPerformed

        int row = internTable.getSelectedRow();
        String tc = internTable.getModel().getValueAt(row, 5).toString();

        try{

            String query = "select * from internreport where Email='"+tc+"'";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            if(rs.next()){

                String name = rs.getString("Name");
                String gender = rs.getString("Gender");
                String nationality = rs.getString("Nationality");
                String institution = rs.getString("Institution");
                int contact = rs.getInt("Contact");
                String email = rs.getString("Email");
                java.util.Date dateOfBirth = rs.getDate("Date of Birth");
                java.util.Date start = rs.getDate("Start Date");
                java.util.Date end = rs.getDate("End Date");
                String remarks = rs.getString("Remarks");

                InternForm.name = name;
                InternForm.gender = gender;
                InternForm.nationality = nationality;
                InternForm.institution = institution;
                InternForm.contact = contact;
                InternForm.email = email;
                InternForm.Key = email;
                InternForm.dOB = dateOfBirth;
                InternForm.start = start;
                InternForm.end = end;
                InternForm.remarks = remarks;

                InternForm.submit = false;
                InternForm.update = true;

                InternForm editForm = new InternForm();

                editForm.setVisible(true);

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        setVisible(false);
    }//GEN-LAST:event_editBtActionPerformed

    private void refreshBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtActionPerformed

        setVisible(false);

        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_refreshBtActionPerformed

    private void createBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtActionPerformed

        InternForm.submit = true;
        InternForm.update = false;

        InternForm internForm = new InternForm();

        internForm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_createBtActionPerformed

    private void internTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internTableMouseClicked
        
        
        
    }//GEN-LAST:event_internTableMouseClicked

    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                System.out.println(time);
                time --;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createBt;
    private com.toedter.calendar.JDateChooser dateSearch;
    private javax.swing.JRadioButton datesearchchoose;
    private javax.swing.JButton deleteBt;
    private javax.swing.JButton editBt;
    private javax.swing.JRadioButton gendersearch;
    private javax.swing.JRadioButton institutionsearch;
    private javax.swing.JTable internTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton namesearch;
    private javax.swing.JButton refreshBt;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables



    static public class HeaderColor extends DefaultTableCellRenderer{
        
        
        public HeaderColor(){
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable jTable, Object value, boolean selected, boolean focused, int row,int column){
            
            super.getTableCellRendererComponent(jTable, value, selected, focused, row, column);
            setBackground(new Color(0,130,153,100));
            setFont(new Font("Gidole",Font.PLAIN,30));
            return this;
            
        }
        
        
    }
    
    
}

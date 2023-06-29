import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class pos extends javax.swing.JFrame {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    int currentRow = 0;
    
    public pos() {
        initComponents();
        doConnect();
    }
    
    public void doConnect() {
        try {
            String host = "jdbc:mysql://localhost:3306/pointofsales?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String userPassword = "";
            
            Connection connection = DriverManager.getConnection(host, userName, userPassword);
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String SQL = "SELECT * FROM `producttable` ";
            
            resultSet = statement.executeQuery(SQL);
            
            resultSet.next();
            int id_col = resultSet.getInt("ID");
            double unit_price = resultSet.getDouble("UnitPrice");
            int quantity_col = resultSet.getInt("Quantity");
            
            String id = Integer.toString(id_col);
            String productName = resultSet.getString("ProductName");
            String productType = resultSet.getString("ProductType");
            String unitPrice = Double.toString(unit_price);
            String quantity = Integer.toString(quantity_col);
            
            productIDTextField.setText(id);
            productNameTextField.setText(productName);
            productTypeTextField.setText(productType);
            unitPriceTextField.setText(unitPrice);
            quantityTextField.setText(quantity);
        } catch(SQLException error){
            JOptionPane.showMessageDialog(this,error.getMessage());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productIDTextField = new javax.swing.JTextField();
        productNameTextField = new javax.swing.JTextField();
        productTypeTextField = new javax.swing.JTextField();
        unitPriceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        totalCostTextField = new javax.swing.JTextField();
        firstButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        updateRecordButton = new javax.swing.JButton();
        deleteRecordButton = new javax.swing.JButton();
        saveNewRecordButton = new javax.swing.JButton();
        newRecordButton = new javax.swing.JButton();
        cancelNewRecordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Product ID");

        jLabel2.setText("Product Name");

        jLabel3.setText("Product Type");

        jLabel4.setText("Unit Price");

        jLabel5.setText("Quantity");

        jLabel6.setText("Total Cost");

        firstButton.setText("First ");

        previousButton.setText("Previous");

        nextButton.setText("Next");

        lastButton.setText("Last");

        updateRecordButton.setText("Update Record");
        updateRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordButtonActionPerformed(evt);
            }
        });

        deleteRecordButton.setText("Delete Record");
        deleteRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordButtonActionPerformed(evt);
            }
        });

        saveNewRecordButton.setText("Save New Record");
        saveNewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewRecordButtonActionPerformed(evt);
            }
        });

        newRecordButton.setText("New Record");
        newRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRecordButtonActionPerformed(evt);
            }
        });

        cancelNewRecordButton.setText("Cancel New Record");
        cancelNewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelNewRecordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productIDTextField)
                            .addComponent(productNameTextField)
                            .addComponent(productTypeTextField)
                            .addComponent(unitPriceTextField)
                            .addComponent(quantityTextField)
                            .addComponent(totalCostTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateRecordButton)
                            .addComponent(deleteRecordButton)
                            .addComponent(saveNewRecordButton)
                            .addComponent(newRecordButton)
                            .addComponent(cancelNewRecordButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstButton)
                        .addGap(47, 47, 47)
                        .addComponent(previousButton)
                        .addGap(51, 51, 51)
                        .addComponent(nextButton)
                        .addGap(56, 56, 56)
                        .addComponent(lastButton)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRecordButton))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteRecordButton)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveNewRecordButton)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(unitPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newRecordButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelNewRecordButton))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstButton)
                    .addComponent(previousButton)
                    .addComponent(nextButton)
                    .addComponent(lastButton))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRecordButtonActionPerformed
        try {
            currentRow = resultSet.getRow();
            
            int id_col = resultSet.getInt("ID");
            String id = Integer.toString(id_col);
            String productName = resultSet.getString("ProductName");
            String productType = resultSet.getString("ProductType");
            String unitPrice = resultSet.getString("UnitPrice");
            String quantity = resultSet.getString("Quantity");
            
            productIDTextField.setEnabled(false);
            updateRecordButton.setEnabled(false);
            deleteRecordButton.setEnabled(false);
            newRecordButton.setEnabled(false);
            
            saveNewRecordButton.setEnabled(true);
            cancelNewRecordButton.setEnabled(true);
        } catch(SQLException error){
            JOptionPane.showMessageDialog(this,error.getMessage());
        }
    }//GEN-LAST:event_newRecordButtonActionPerformed

    private void cancelNewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelNewRecordButtonActionPerformed
        try {
            currentRow = resultSet.getRow();
            
            productIDTextField.setText("");
            productNameTextField.setText("");
            productTypeTextField.setText("");
            unitPriceTextField.setText("");
            quantityTextField.setText("");
            
            productIDTextField.setEnabled(true);
            updateRecordButton.setEnabled(true);
            deleteRecordButton.setEnabled(true);
            newRecordButton.setEnabled(true);

            saveNewRecordButton.setEnabled(false);
            cancelNewRecordButton.setEnabled(false);
        } catch(SQLException error){
            JOptionPane.showMessageDialog(this,error.getMessage());
        }
    }//GEN-LAST:event_cancelNewRecordButtonActionPerformed

    private void saveNewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewRecordButtonActionPerformed
        String name = productNameTextField.getText();
        String type = productTypeTextField.getText();
        String price = unitPriceTextField.getText();
        String productQuan = quantityTextField.getText();
        
        try {
            resultSet.moveToInsertRow();
            
            resultSet.updateString("ProductName", name);
            resultSet.updateString("ProductType", type);
            resultSet.updateString("UnitPrice", price);
            resultSet.updateString("Quantity", productQuan);
            
            resultSet.insertRow();
            statement.close();
            resultSet.close();
            
            String host = "jdbc:mysql://localhost:3306/pointofsale?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String userPassword = "";
            Connection connection = DriverManager.getConnection(host, userName, userPassword);
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String SQL = "SELECT * FROM `producttable` ";
            
            resultSet = statement.executeQuery(SQL);
            resultSet.next();
            int id_col = resultSet.getInt("ID");
            String id = Integer.toString(id_col);
            String name2 = resultSet.getString("ProductName");
            String type2 = resultSet.getString("ProductType");
            String price2 = resultSet.getString("UnitPrice");
            String productQuan2 = resultSet.getString("Quantity");
            
            productIDTextField.setText(id);
            productNameTextField.setText(name2);
            productTypeTextField.setText(type2);
            unitPriceTextField.setText(price2);
            quantityTextField.setText(productQuan2);
            
            productIDTextField.setEnabled(true);
            updateRecordButton.setEnabled(true);
            deleteRecordButton.setEnabled(true);
            newRecordButton.setEnabled(true);
            saveNewRecordButton.setEnabled(true);
            cancelNewRecordButton.setEnabled(true);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }//GEN-LAST:event_saveNewRecordButtonActionPerformed

    private void updateRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordButtonActionPerformed
        String name = productNameTextField.getText();
        String type = productTypeTextField.getText();
        String price = unitPriceTextField.getText();
        String productQuan = quantityTextField.getText();
        try{
            resultSet.updateString("ProductName", name);
            resultSet.updateString("ProductType", type);
            resultSet.updateString("UnitPrice", price);
            resultSet.updateString("Quantity", productQuan);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }//GEN-LAST:event_updateRecordButtonActionPerformed

    private void deleteRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordButtonActionPerformed
        String name = productNameTextField.getText();
        String type = productTypeTextField.getText();
        String price = unitPriceTextField.getText();
        String productQuan = quantityTextField.getText();
        
        try {
            resultSet.deleteRow();
            statement.close();
            resultSet.close();
            
            String host = "jdbc:mysql://localhost:3306/pointofsale?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String userPassword = "";
            Connection connection = DriverManager.getConnection(host, userName, userPassword);
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String SQL = "SELECT * FROM `producttable` ";
            
            resultSet = statement.executeQuery(SQL);
            resultSet.next();
            int id_col = resultSet.getInt("ID");
            String id = Integer.toString(id_col);
            String name2 = resultSet.getString("ProductName");
            String type2 = resultSet.getString("ProductType");
            String price2 = resultSet.getString("UnitPrice");
            String productQuan2 = resultSet.getString("Quantity");
            
            productIDTextField.setText(id);
            productNameTextField.setText(name2);
            productTypeTextField.setText(type2);
            unitPriceTextField.setText(price2);
            quantityTextField.setText(productQuan2);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }//GEN-LAST:event_deleteRecordButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelNewRecordButton;
    private javax.swing.JButton deleteRecordButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton lastButton;
    private javax.swing.JButton newRecordButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JTextField productIDTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productTypeTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton saveNewRecordButton;
    private javax.swing.JTextField totalCostTextField;
    private javax.swing.JTextField unitPriceTextField;
    private javax.swing.JButton updateRecordButton;
    // End of variables declaration//GEN-END:variables
}

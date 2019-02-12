/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.View;

import BankManagementSystem.Controller.AccountController;
import BankManagementSystem.Controller.BlacklistcustomerController;
import BankManagementSystem.Controller.CustomerController;
import BankManagementSystem.Controller.LoanController;
import BankManagementSystem.DBConnection.DBConnection;
import BankManagementSystem.Model.AccountModel;
import BankManagementSystem.Model.BlacklistCustomerModel;
import BankManagementSystem.Model.CustomerModel;
import BankManagementSystem.Model.LoanModel;
import static BankManagementSystem.View.MainForm.mainPanel;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author NEOx
 */
public class CustomerReports extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustomerReports
     */
    public CustomerReports() {
        initComponents();
        autoDate();
        autoTime();
    }
    
    private void autoTime(){
    new Thread (new Runnable() {
        public void run (){
            while(true){
                Date time = new Date();
                String curDate=new SimpleDateFormat("hh:mm:ss aa").format(time);
                timelbl.setText(curDate);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    
                }
            }
        }
    }).start();

}
     private void autoDate(){
        Date date=new Date();
        SimpleDateFormat curDate=new SimpleDateFormat("yyyy-MM-dd");
        String newDate=curDate.format(date);
        datelbl.setText(newDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        datelbl = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/generateReport.jpg"))); // NOI18N
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 900, 210, 110));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Customers", "Loan Customers", "Blacklist Customers" }));
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 270, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Report Type");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 270, 70));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 150, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(":");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 20, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CID", "First Name", "Last Name", "Age", "NIC", "Address", "Occupation", "Mobile No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 1660, 490));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/backButton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 950, 150, 50));

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setText("16");
        jPanel7.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 320, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 20, 30, 90));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Reports");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 880, 80));

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("08:16:00");
        jPanel7.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 20, 360, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-horizontal-line.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1910, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/istock000003037994medium.png"))); // NOI18N
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1920, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ViewReportMenu vr=new ViewReportMenu();
        mainPanel.removeAll();
        mainPanel.add(vr);
        vr.setVisible(true);
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        if(jComboBox1.getSelectedItem()=="All Customers"){
            dtm.setRowCount(0);
            String type="All Customers";
            try {
                ArrayList<CustomerModel> cstList=CustomerController.viewCustomer();
                for(CustomerModel cst : cstList){
                    Object[] row={cst.getCID(),cst.getfName(),cst.getlName(),cst.getAge(),cst.getNIC(),cst.getAddress(),cst.getOccupation(),cst.getMobileNo()};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jComboBox1.getSelectedItem()=="Loan Customers"){
            dtm.setRowCount(0);
            String type="Loan Customers";
            try {
                ArrayList<LoanModel> lnList=LoanController.viewLoan();
                for(LoanModel ln : lnList){
                    String AID=ln.getAID();
                    AccountModel act=AccountController.searchAccount(AID);
                    CustomerModel cst=CustomerController.searchCustomer(act.getCID());
                    Object[] row={cst.getCID(),cst.getfName(),cst.getlName(),cst.getAge(),cst.getNIC(),cst.getAddress(),cst.getOccupation(),cst.getMobileNo()};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            dtm.setRowCount(0);
            String type="Blacklist Customers";
            try {
                ArrayList<BlacklistCustomerModel> cstList=BlacklistcustomerController.viewCustomer();
                for(BlacklistCustomerModel bt : cstList){
                    CustomerModel cst=CustomerController.searchCustomer(bt.getCID());
                    Object[] row={cst.getCID(),cst.getfName(),cst.getlName(),cst.getAge(),cst.getNIC(),cst.getAddress(),cst.getOccupation(),cst.getMobileNo()};
                    dtm.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jComboBox1.getSelectedItem()=="All Customers"){
            try {
                InputStream is=getClass().getResourceAsStream("AllCustomer.jrxml");
                JasperReport jp = JasperCompileManager.compileReport(is);
                HashMap hm=new HashMap();
                Connection conn=DBConnection.getDBConnection().getConnection();
                JasperPrint jsp=JasperFillManager.fillReport(jp,hm,conn);
                JasperViewer.viewReport(jsp);
                
            } catch (JRException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else if(jComboBox1.getSelectedItem()=="Loan Customers"){
            try {
                InputStream is=getClass().getResourceAsStream("LoanCustomer.jrxml");
                JasperReport jp = JasperCompileManager.compileReport(is);
                HashMap hm=new HashMap();
                Connection conn=DBConnection.getDBConnection().getConnection();
                JasperPrint jsp=JasperFillManager.fillReport(jp,hm,conn);
                JasperViewer.viewReport(jsp);
                
            } catch (JRException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else{
            
            try {
                InputStream is=getClass().getResourceAsStream("BlacklistCustomer.jrxml");
                JasperReport jp = JasperCompileManager.compileReport(is);
                HashMap hm=new HashMap();
                Connection conn=DBConnection.getDBConnection().getConnection();
                JasperPrint jsp=JasperFillManager.fillReport(jp,hm,conn);
                JasperViewer.viewReport(jsp);
                
            } catch (JRException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerReports.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel timelbl;
    // End of variables declaration//GEN-END:variables
}

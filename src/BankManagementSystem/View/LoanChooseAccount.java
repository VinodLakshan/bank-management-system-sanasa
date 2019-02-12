/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.View;

import BankManagementSystem.Controller.AccountController;
import BankManagementSystem.Controller.AccountTypeController;
import BankManagementSystem.Controller.CustomerController;
import BankManagementSystem.Model.AccountModel;
import BankManagementSystem.Model.AccountTypeModel;
import BankManagementSystem.Model.CustomerModel;
import static BankManagementSystem.View.MainForm.mainPanel;
import static BankManagementSystem.View.OpenAnAccount.txtId;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NEOx
 */
public class LoanChooseAccount extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoanChooseAcciunt
     */
    public String customerId;
    
    public LoanChooseAccount() {
        initComponents();
        autoDate();
        autoTime();
        txtactID.requestFocus();
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtactID = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtactholderName = new javax.swing.JTextField();
        txtAccountType = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtactHolder = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/backButton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 920, 150, 50));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, 30, 80));

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setText("16");
        jPanel1.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 320, -1));

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("08:16:00");
        jPanel1.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 20, 360, 90));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 30, 780));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Account Details");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 450, 70));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Account ID");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 210, 50));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(":");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, 50));

        txtactID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtactID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtactID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 430, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Account holder");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 250, 50));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Name");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 250, 50));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(":");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 20, 50));

        txtactholderName.setEditable(false);
        txtactholderName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtactholderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 430, -1));

        txtAccountType.setEditable(false);
        txtAccountType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 430, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText(":");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 20, 50));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Account Type");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 250, 50));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Current Balance");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 270, 50));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText(":");
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 20, 50));

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 430, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Account holder");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 250, 50));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(":");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 20, 50));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Customer Loan History");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 450, 70));

        txtactHolder.setEditable(false);
        txtactHolder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtactHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactHolderActionPerformed(evt);
            }
        });
        jPanel1.add(txtactHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 430, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("ID");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/nextButton.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 920, 150, 50));

        loanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Loan ID", "Account ID ", "Reason", "Date ", "Amount", "Amount To Be Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(loanTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 940, 510));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Make a Loan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 880, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-horizontal-line.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1910, 40));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1070));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/istock000003037994medium.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1920, 1100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoanFindCustomer ln1 =new LoanFindCustomer();
        mainPanel.removeAll();
        mainPanel.add(ln1);
        ln1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static String actID;
    public static String custId1;
    private void txtactIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactIDActionPerformed
        actID=txtactID.getText();
        String checkID=null;
        try {
            AccountModel actCheck =AccountController.searchAccount(actID);
            checkID=actCheck.getCID();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoanChooseAccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoanChooseAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(customerId.equals(checkID)){
            AccountModel actm;
            try {
                actm = AccountController.searchAccount(actID);
                if(actm!=null){
                    String ACTID=actm.getAccountType();
                    String actHolderID=actm.getCID();
                    CustomerModel cstm=CustomerController.searchCustomer(actHolderID);
                    String actHolderName1=cstm.getfName();
                    String actHolderName2=cstm.getlName();

                    AccountTypeModel accountType=AccountTypeController.searchAccountTypeID(ACTID);
                    String accountTypeName=accountType.getName();

                    txtactHolder.setText(actHolderID);
                    txtAccountType.setText(accountTypeName);
                    txtactholderName.setText(actHolderName1+" "+actHolderName2);
                    txtBalance.setText(Double.toString(actm.getBalance()));
                }else{
                    JOptionPane.showMessageDialog(this, "Account was not Found..!!");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"This is not your account...Please check the Account number..");
        }
        if(txtBalance.getText().trim().length()>0){
               jButton2.setEnabled(true);
        }

    }//GEN-LAST:event_txtactIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoanDetails ld1=new LoanDetails();
        ld1.AID=actID;
        ld1.custId2=custId1;
        mainPanel.removeAll();
        mainPanel.add(ld1);
        ld1.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtactHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactHolderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable loanTable;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtBalance;
    public static javax.swing.JTextField txtactHolder;
    public static javax.swing.JTextField txtactID;
    public static javax.swing.JTextField txtactholderName;
    // End of variables declaration//GEN-END:variables
}

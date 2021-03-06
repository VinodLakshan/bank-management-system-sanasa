/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.View;

import All.IDgenerator;
import BankManagementSystem.Controller.AccountController;
import BankManagementSystem.Controller.AccountTypeController;
import BankManagementSystem.Controller.CustomerController;
import BankManagementSystem.Controller.TransactionController;
import BankManagementSystem.Model.AccountModel;
import BankManagementSystem.Model.AccountTypeModel;
import BankManagementSystem.Model.CustomerModel;
import BankManagementSystem.Model.TransactionModel;
import static BankManagementSystem.View.Deposit.txtAccountType;
import static BankManagementSystem.View.Deposit.txtBalance;
import static BankManagementSystem.View.Deposit.txtactID;
import static BankManagementSystem.View.MainForm.mainPanel;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEOx
 */
public class Withdraw extends javax.swing.JInternalFrame {

    /**
     * Creates new form Withdraw
     */
    public Withdraw() {
        initComponents();
        autoDate();
        autoTime();
        getID();
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
        jLabel35 = new javax.swing.JLabel();
        txtTID = new javax.swing.JTextField();
        txtactID = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtactHolder = new javax.swing.JTextField();
        txtactholderName = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtAccountType = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtAmountInWords = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        datelbl = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Transaction ID");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 50));

        txtTID.setEditable(false);
        txtTID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 430, -1));

        txtactID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtactID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtactID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 430, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(":");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 20, 50));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Account ID");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 210, 50));

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 170, 430, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText(":");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 160, 20, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Transaction History");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 330, 50));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Account holder");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 250, 50));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ID");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 50));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText(":");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 20, 50));

        txtactHolder.setEditable(false);
        txtactHolder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtactHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 430, -1));

        txtactholderName.setEditable(false);
        txtactholderName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtactholderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 430, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(":");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 20, 50));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Account holder");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 250, 50));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Name");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 250, 50));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Account Type");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 250, 50));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText(":");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 20, 50));

        txtAccountType.setEditable(false);
        txtAccountType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 430, -1));

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 430, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText(":");
        jPanel1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 20, 50));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Current Balance");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 270, 50));

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountKeyReleased(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 730, 430, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText(":");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 720, 20, 50));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Amount");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 720, 150, 50));

        txtAmountInWords.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmountInWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountInWordsActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmountInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 800, 640, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText(":");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 790, 20, 50));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Amount in words");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 790, 260, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/backButton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 920, 150, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/confirmButton.png"))); // NOI18N
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 920, 150, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Transactor Name", "Transaction Type", "Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 800, 440));

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setText("16");
        jPanel1.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 320, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 20, 30, 90));

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("08:16:00");
        jPanel1.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 20, 360, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-horizontal-line.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 970, 40));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Date");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 160, 130, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Money Withdraw");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 880, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-horizontal-line.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1910, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1060));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1060));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1060));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1920, 1060));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1060));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 1060));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/istock000003037994medium.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1920, 1100));

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

    private void txtTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIDActionPerformed

    private void txtactIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactIDActionPerformed
        txtAmount.requestFocus();
        txtAmount.setText(null);
        txtAmountInWords.setText(null);
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        String actID=txtactID.getText();
        AccountModel actm;
        
        try {
            actm = AccountController.searchAccount(actID);
            if(actm!=null){
                ArrayList<TransactionModel> trList=TransactionController.searchTransactionArray(actID);
                dtm.setRowCount(0);
                for (TransactionModel tr:trList) {
                    String TID = tr.getTID();
                    String Name = tr.getTransactorName();
                    String Type = tr.getTransactionType();
                    String date = tr.getDate();
                    String amount=Double.toString(tr.getTransactionAmount());
                    
                    Object[] row = {TID, Name, Type, date,amount};
                    dtm.addRow(row);
                }
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
        
        

    }//GEN-LAST:event_txtactIDActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        int amount=Integer.parseInt(txtAmount.getText());
        txtAmountInWords.setText(convert(amount));
        txtAmountInWords.requestFocus();
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtAmountInWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountInWordsActionPerformed
        jButton3.setEnabled(true);
    }//GEN-LAST:event_txtAmountInWordsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MoneyTransactionMenu t1 =new MoneyTransactionMenu();
        mainPanel.removeAll();
        mainPanel.add(t1);
        t1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String TID=txtTID.getText();
        String AID=txtactID.getText();
        String date=datelbl.getText();
        double crntBal=Double.parseDouble(txtBalance.getText());
        double trAmount=Double.parseDouble(txtAmount.getText());
        String transactorName=txtactholderName.getText();
        String transactionType="Withdraw";
        double amount=Double.parseDouble(txtAmount.getText());
        
        AccountModel act1=null;
        try {
            act1=AccountController.searchAccount(AID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String CID=act1.getCID();
        String accountType=act1.getAccountType();
        String guardian=act1.getGuardianName();
        double newAmount=crntBal-trAmount;
            
        TransactionModel tr=new TransactionModel(TID, AID, transactorName, date, transactionType, amount);
        AccountModel act2=new AccountModel(AID, CID,accountType ,guardian, newAmount);
        
        try {
            boolean res=TransactionController.addTransaction(tr);
            boolean res2=AccountController.updateAccount(act2);
            
            if(res){
                JOptionPane.showMessageDialog(this,"Transaction Successfull..");
                Homepage h1 = new Homepage();
                mainPanel.removeAll();
                mainPanel.add(h1);
                h1.setVisible(true);

            }else{
                JOptionPane.showMessageDialog(this,"Transaction Failed..");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
       if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            Validation.Validation.limitesIntegers(txtAmount, 7);
        }
    }//GEN-LAST:event_txtAmountKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmountInWords;
    private javax.swing.JTextField txtBalance;
    public static javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtTID;
    public static javax.swing.JTextField txtactHolder;
    public static javax.swing.JTextField txtactID;
    public static javax.swing.JTextField txtactholderName;
    // End of variables declaration//GEN-END:variables
    private String oneToHundred(int amount){
        String a1=" ";
        while( amount!=0){
            if(amount==1){
                a1=a1+"One";
                amount=0;
            }else if( amount ==2 ){
                a1=a1+"Two";
                amount=0;
            }else if( amount ==3 ){
                a1=a1+"Three";
                amount=0;
            }else if( amount ==4 ){
                a1=a1+"Four";
                amount=0;
            }else if( amount ==5 ){
                a1=a1+"Five";
                amount=0;
            }else if( amount ==6 ){
                a1=a1+"Six";
                amount=0;
            }else if( amount ==7 ){
                a1=a1+"Seven";
                amount=0;
            }else if( amount ==8 ){
                a1=a1+"Eight";
                amount=0;
            }else if( amount ==9 ){
                a1=a1+"Nine";
                amount=0;
            }else if( amount ==10 ){
                a1=a1+"Ten";
                amount=0;
            }else if( amount ==11 ){
                a1=a1+"Eleven";
                amount=0;
            }else if( amount ==12){
                a1=a1+"Twelve";
                amount=0;
            }else if( amount ==13){
                a1=a1+"Thirteen";
                amount=0;
            }else if( amount ==14){
                a1=a1+"Fourteen";
                amount=0;
            }else if( amount ==15){
                a1=a1+"Fifteen";
                amount=0;
            }else if( amount ==16){
                a1=a1+"Sixteen";
                amount=0;
            }else if( amount ==17){
                a1=a1+"Seventeen";
                amount=0;
            }else if( amount ==18){
                a1=a1+"Eighteen";
                amount=0;
            }else if( amount ==19){
                a1=a1+"Nineteen";
                amount=0;
            }else if(amount>=20 && amount <30){
                a1=a1+"Twenty ";
                amount=amount-20;
            }else if(amount>=30 && amount <40){
                a1=a1+"Thirty ";
                amount=amount-30;
            }else if(amount>=40 && amount <50){
                a1=a1+"Fourty ";
                amount=amount-40;
            }else if(amount>=50 && amount <60){
                a1=a1+"Fifty ";
                amount=amount-50;
            }else if(amount>=60 && amount <70){
                a1=a1+"Sixty ";
                amount=amount-60;
            }else if(amount>=70 && amount <80){
                a1=a1+"Seventy ";
                amount=amount-70;
            }else if(amount>=80 && amount <90){
                a1=a1+"Eighty ";
                amount=amount-80;
            }else if(amount>=90 && amount <100){
                a1=a1+"Ninety ";
                amount=amount-90;
            }
        }
        
        return a1;
    }

    private String convert(int amount){
        String a1=" ";
        
        while(amount != 0){
            if(amount >=1 && amount <100){
                a1=a1+oneToHundred(amount);
                amount=0;
            }else if(amount >= 100 && amount < 1000){
                a1=a1+oneToHundred(amount/100);
                a1=a1+" Hundred ";
                amount = amount % 100;
            }else if(amount >= 1000 && amount < 10000){
                a1=a1+oneToHundred(amount/1000);
                a1=a1+" Thousand";
                amount = amount % 1000;
            }else if(amount >= 10000 && amount < 100000){
                a1=a1+oneToHundred(amount/1000);
                a1=a1+" Thousand";
                amount = amount % 1000;
            }else if(amount >= 100000 && amount <10000000){
                a1=a1+oneToHundred(amount/100000);
                a1=a1+" Lakh";
                amount = amount % 100000;
            }
        }
        
        return a1;
    }

    public  void getID(){
       String newID;
        try {
            newID=IDgenerator.autoID("transaction", "TID", "T");
            txtTID.setText(newID);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
}

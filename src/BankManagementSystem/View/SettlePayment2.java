/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankManagementSystem.View;

import All.IDgenerator;
import BankManagementSystem.Controller.AccountController;
import BankManagementSystem.Controller.ChequeController;
import BankManagementSystem.Controller.CustomerController;
import BankManagementSystem.Controller.LoanController;
import BankManagementSystem.Controller.PaymentController;
import BankManagementSystem.Model.AccountModel;
import BankManagementSystem.Model.ChequeModel;
import BankManagementSystem.Model.CustomerModel;
import BankManagementSystem.Model.LoanModel;
import BankManagementSystem.Model.PaymentModel;
import static BankManagementSystem.View.MainForm.mainPanel;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author NEOx
 */
public class SettlePayment2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form SettlePayment2
     */
    String PID;
    public static String LID;
    
    public SettlePayment2() {
        initComponents();
        autoDate();
        autoTime();
        getID();
        lbl.setVisible(false);
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

        String a=" ";
    
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtAmountInWords = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtChequeNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtExpireDate = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtBankName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        datelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        timelbl = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Amount");
        jPanel1.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 150, 50));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText(":");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 20, 50));

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
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 430, -1));

        txtAmountInWords.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmountInWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountInWordsActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmountInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 730, 750, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText(":");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 20, 50));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Amount in words");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, 260, 50));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Payment History");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 450, 70));

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/black Transparent.png"))); // NOI18N
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 820, 260));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Expire date");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 260, 70));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(":");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 20, 50));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 30, 420));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/backButton.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 920, 150, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment Method");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 290, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(":");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 20, 50));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-vertical-line.png"))); // NOI18N
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 30, 30, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cheque No.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 210, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(":");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 20, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/gold-horizontal-line.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 830, 40));

        txtChequeNo.setEditable(false);
        txtChequeNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtChequeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChequeNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtChequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 430, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bank Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 260, 70));

        txtExpireDate.setDateFormatString("yyyy MM dd");
        txtExpireDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtExpireDate.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtExpireDateComponentAdded(evt);
            }
        });
        txtExpireDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtExpireDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(txtExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 430, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(":");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 20, 50));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cheque");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 130, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Cash");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 120, 30));

        txtBankName.setEditable(false);
        txtBankName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNameActionPerformed(evt);
            }
        });
        txtBankName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBankNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 430, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManagementSystem/View/confirmButton.png"))); // NOI18N
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 920, 150, 50));

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 255, 255));
        datelbl.setText("16");
        jPanel1.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 320, -1));

        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Payment ID", "Date", "Amount", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 940, 400));

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("08:16:00");
        jPanel1.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 20, 360, 90));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Payment");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 450, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Settle Payment");
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
        SettlePayment1 st1=new SettlePayment1();
        mainPanel.removeAll();
        mainPanel.add(st1);
        st1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt2MouseClicked
        
    }//GEN-LAST:event_jt2MouseClicked

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        int amount=Integer.parseInt(txtAmount.getText());
        txtAmountInWords.setText(convert(amount));
        txtAmountInWords.requestFocus();
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtAmountInWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountInWordsActionPerformed
        jButton4.setEnabled(true);
    }//GEN-LAST:event_txtAmountInWordsActionPerformed

    private void txtExpireDateComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtExpireDateComponentAdded

    }//GEN-LAST:event_txtExpireDateComponentAdded

    private void txtExpireDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtExpireDateAncestorAdded

    }//GEN-LAST:event_txtExpireDateAncestorAdded

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            lbl.setVisible(true);
        }else{
            lbl.setVisible(false);
        }
        txtAmount.requestFocus();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
            lbl.setVisible(false);
            txtChequeNo.setEditable(true);
            txtBankName.setEditable(true);
        }else{
            lbl.setVisible(true);
        }
        txtChequeNo.requestFocus();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String paymentMethod=null;
        String chequeNo=null;
        String bankName=null;
        String expireDate=null;
        String date=datelbl.getText();
        double amount=Double.parseDouble(txtAmount.getText());
        String amountInWords=convert((int) amount);
        if(jRadioButton2.isSelected()){
            PaymentModel payment=new PaymentModel(PID, LID,date,amount,paymentMethod);
            
            try {
               boolean b1=PaymentController.addPayment(payment);
                LoanModel ln = LoanController.searchLoan(LID);
                double newToBePaid=ln.getToBePaid()-amount;
                boolean res=LoanController.updateLoan(newToBePaid, LID);
                if(res){
                    String AID=ln.getAID(); 
                    AccountModel act=AccountController.searchAccount(AID);
                    String CID=act.getCID();
                    CustomerModel cst=CustomerController.searchCustomer(CID);
                    String Name=cst.getfName()+" "+cst.getlName();
                    InputStream is=getClass().getResourceAsStream("PaymentBill.jrxml");
                    JasperReport jp = JasperCompileManager.compileReport(is);
                    HashMap hm=new HashMap();

                    hm.put("CID",CID);
                    hm.put("AID",AID);
                    hm.put("Name",Name);
                    hm.put("amount",amount);
                    hm.put("amountInWords",amountInWords);  
                    JasperPrint jsp = JasperFillManager.fillReport(jp,hm,new JREmptyDataSource());
                    JOptionPane.showMessageDialog(this, "Payment Successfull....");
                    JasperViewer.viewReport(jsp);
                    
                    Homepage h1 = new Homepage();
                    mainPanel.removeAll();
                    mainPanel.add(h1);
                    h1.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(this, "Payment Failed....");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SettlePayment2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SettlePayment2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(SettlePayment2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }else{
            paymentMethod="cheque";
            chequeNo=txtChequeNo.getText();
            bankName=txtBankName.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            expireDate=sdf.format(txtExpireDate.getDate());
            
        
            PaymentModel payment=new PaymentModel(PID, LID,date,amount,paymentMethod);
            ChequeModel chm=new ChequeModel(chequeNo, PID, bankName, expireDate, amount);
            
            try {
                boolean b1=PaymentController.addPayment(payment);
                boolean b2=ChequeController.addCheque(chm);
                LoanModel ln = LoanController.searchLoan(LID);
                double newToBePaid=ln.getToBePaid()-amount;
                boolean res=LoanController.updateLoan(newToBePaid, LID);
                if(res){
                    JOptionPane.showMessageDialog(this, "Payment Successfull....");
                }else{
                    JOptionPane.showMessageDialog(this, "Payment Failed....");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SettlePayment2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SettlePayment2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtChequeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChequeNoActionPerformed
        txtBankName.requestFocus();
    }//GEN-LAST:event_txtChequeNoActionPerformed

    private void txtBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankNameActionPerformed
       
    }//GEN-LAST:event_txtBankNameActionPerformed

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            Validation.Validation.limitesIntegers(txtAmount, 7);
        }
    }//GEN-LAST:event_txtAmountKeyReleased

    private void txtBankNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankNameKeyReleased
        if(evt.getKeyCode() != KeyEvent.VK_BACK_SPACE){
            Validation.Validation.name(txtBankName);
        }
    }//GEN-LAST:event_txtBankNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jt2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmountInWords;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtChequeNo;
    private com.toedter.calendar.JDateChooser txtExpireDate;
    // End of variables declaration//GEN-END:variables
    
    public  void getID(){
       String newID;
        try {
            newID=IDgenerator.autoID("payment", "PID", "P");
            PID=newID;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.simplebankingsystem;

/**
 *
 * @author NC
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transfer = new javax.swing.JButton();
        PayElec = new javax.swing.JButton();
        Loan = new javax.swing.JButton();
        Saving = new javax.swing.JButton();
        ChaPass = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Transaction = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        View = new javax.swing.JButton();
        LockCard = new javax.swing.JButton();
        PayWater = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        Transfer.setBackground(new java.awt.Color(0, 204, 204));
        Transfer.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\bank-transfer (2).png")); // NOI18N
        Transfer.setText("Transfer");

        PayElec.setBackground(new java.awt.Color(0, 204, 204));
        PayElec.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\mobile-payment.png")); // NOI18N
        PayElec.setText("Pay Electricity Bill");

        Loan.setBackground(new java.awt.Color(0, 204, 204));
        Loan.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\business.png")); // NOI18N
        Loan.setText("Loan");
        Loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanActionPerformed(evt);
            }
        });

        Saving.setBackground(new java.awt.Color(0, 204, 204));
        Saving.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\wallet.png")); // NOI18N
        Saving.setText("Saving");

        ChaPass.setBackground(new java.awt.Color(0, 204, 204));
        ChaPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\settings.png")); // NOI18N
        ChaPass.setText("Change Password");

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Balance");

        Transaction.setBackground(new java.awt.Color(0, 204, 204));
        Transaction.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\notification.png")); // NOI18N
        Transaction.setText("Transaction");

        View.setBackground(new java.awt.Color(0, 204, 204));
        View.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\view.png")); // NOI18N
        View.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LockCard.setBackground(new java.awt.Color(0, 204, 204));
        LockCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\protection.png")); // NOI18N
        LockCard.setText("Lock Card");

        PayWater.setBackground(new java.awt.Color(0, 204, 204));
        PayWater.setIcon(new javax.swing.ImageIcon("C:\\Users\\NC\\Pictures\\Java\\mobile-payment.png")); // NOI18N
        PayWater.setText("Pay Water Bill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(View)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Loan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PayWater, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(Transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PayElec))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Saving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Transaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LockCard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChaPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(View)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transfer)
                    .addComponent(Transaction))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loan)
                    .addComponent(Saving))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayElec)
                    .addComponent(LockCard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PayWater)
                    .addComponent(ChaPass))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void LoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanActionPerformed
        dispose();
        Loan lo=new Loan();
        lo.setVisible(true);
    }//GEN-LAST:event_LoanActionPerformed


    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChaPass;
    private javax.swing.JButton Loan;
    private javax.swing.JButton LockCard;
    private javax.swing.JButton PayElec;
    private javax.swing.JButton PayWater;
    private javax.swing.JButton Saving;
    private javax.swing.JButton Transaction;
    private javax.swing.JButton Transfer;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

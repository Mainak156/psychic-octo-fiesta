package com.mainaksen.airestaurant;

import java.awt.Desktop;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CardPayment extends javax.swing.JFrame {

    
    
    Desktop desktop;
    
    public CardPayment() {
        
        desktop= Desktop.getDesktop();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Bank");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 262, 30));

        jRadioButton1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jRadioButton1.setText("SBI");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 80, 30));

        jRadioButton2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jRadioButton2.setText("HDFC");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 53, 80, 31));

        jRadioButton3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jRadioButton3.setText("BOI");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 53, 80, 31));

        jButton1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        pack();
    }// </editor-fold>                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            desktop.browse(new URI("https://www.onlinesbi.com"));
        } catch (Exception ex) {
            Logger.getLogger(CardPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            desktop.browse(new URI("https://netbanking.hdfcbank.com/netbanking/"));
        } catch (Exception ex) {
            Logger.getLogger(CardPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            desktop.browse(new URI("https://bankofindia.co.in/"));
        } catch (Exception ex) {
            Logger.getLogger(CardPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.dispose();
        
    }                                        

    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration                   
}

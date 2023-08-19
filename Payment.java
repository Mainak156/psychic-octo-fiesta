package com.mainaksen.airestaurant;


/**
 *
 * @author Mainak156
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    
    
        
    public Payment() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Payment Method");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 650, 60));

        jRadioButton2.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 51, 0));
        jRadioButton2.setText("Debit/Credit Card");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 198, 49));

        jRadioButton3.setFont(new java.awt.Font("Algerian", 0, 16)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 51, 0));
        jRadioButton3.setText("Cash");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 198, 49));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\homeicon.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 90, 50));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\closeicon.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 90, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\paymentbg.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 360));

        pack();
    }// </editor-fold>                        

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    new CardPayment().setVisible(true);
        
    }                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.dispose();
        new Login().setVisible(true);
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.dispose();
        
    }                                        

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        new CashPayment().setVisible(true);
    }                                             

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration                   
}

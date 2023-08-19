package com.mainaksen.airestaurant;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mainak156
 */
public class MenuPage extends javax.swing.JFrame {

    
    
    int totalItems= 0;
    double totalCost= 0;
    
    FileWriter fw;
    
    public MenuPage() {
        try {
            fw= new FileWriter("OrderDetails.txt");
        } catch (IOException ex) {
            Logger.getLogger(MenuPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("vegetable");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 320, 50));

        jCheckBox1.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox1.setText("Mushroom Masala                                    Rs. 220");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.setOpaque(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 36));

        jCheckBox2.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox2.setText("Paneer Masala                                         Rs. 210");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jCheckBox2.setOpaque(false);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 36));

        jCheckBox3.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox3.setText("Veg Handi                                                      Rs. 180");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jCheckBox3.setOpaque(false);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 36));

        jCheckBox4.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox4.setText("Chilly Paneer                                             Rs. 150");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jCheckBox4.setOpaque(false);
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 190));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox5.setText("Muffin                                                                Rs. 90");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jCheckBox5.setOpaque(false);
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 36));

        jCheckBox6.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox6.setText("Strawberry Cake                                        RS. 150");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jCheckBox6.setOpaque(false);
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 36));

        jCheckBox7.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox7.setText("Black Forest                                                 Rs. 160");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jCheckBox7.setOpaque(false);
        jPanel2.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 36));

        jCheckBox8.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox8.setText("CHocolate Lava Pastry                            Rs. 50");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jCheckBox8.setOpaque(false);
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 36));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Cakes");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 320, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 31, 340, 190));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Shakes");
        jLabel4.setOpaque(false);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 320, 50));

        jCheckBox9.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox9.setText("Strawbery Shake                                    Rs. 100");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jCheckBox9.setOpaque(false);
        jPanel3.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 36));

        jCheckBox10.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox10.setText("Banana Shake                                            Rs. 80");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jCheckBox10.setOpaque(false);
        jPanel3.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 36));

        jCheckBox11.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox11.setText("Choco Shake                                                Rs. 90");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jCheckBox11.setOpaque(false);
        jPanel3.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 36));

        jCheckBox12.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox12.setText("CHIKOO Shake                                               Rs. 85");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jCheckBox12.setOpaque(false);
        jPanel3.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 300, 36));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 340, 190));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Soup");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 320, 50));

        jCheckBox13.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox13.setText("Manchow Soup                                                Rs. 120");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        jCheckBox13.setOpaque(false);
        jPanel4.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 36));

        jCheckBox14.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox14.setText("Cream of Mushroom Soup                           Rs. 130");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        jCheckBox14.setOpaque(false);
        jPanel4.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 36));

        jCheckBox15.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox15.setText("Tomato Soup                                                   Rs. 90");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        jCheckBox15.setOpaque(false);
        jPanel4.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 36));

        jCheckBox16.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(0, 204, 255));
        jCheckBox16.setText("Lemon Coriander Soup                                Rs. 100");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        jCheckBox16.setOpaque(false);
        jPanel4.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 36));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 340, 190));

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\Next.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\menu1pagebg.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));

        pack();
    }// </editor-fold>                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox1.isSelected()){
            
            ++totalItems;
            totalCost += 220;
        }
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox2.isSelected()){
            
            ++totalItems;
            totalCost += 210;
        }
    }                                          

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox3.isSelected()){
            
            ++totalItems;
            totalCost += 180;
        }
    }                                          

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox4.isSelected()){
            
            ++totalItems;
            totalCost += 150;
        }
    }                                          

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox5.isSelected()){
            
            ++totalItems;
            totalCost += 90;
        }
    }                                          

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox6.isSelected()){
            
            ++totalItems;
            totalCost += 150;
        }
    }                                          

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox7.isSelected()){
            
            ++totalItems;
            totalCost += 160;
        }
    }                                          

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox8.isSelected()){
            
            ++totalItems;
            totalCost += 50;
        }
    }                                          

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox13.isSelected()){
            
            ++totalItems;
            totalCost += 120;
        }
    }                                           

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox14.isSelected()){
            
            ++totalItems;
            totalCost += 130;
        }
    }                                           

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox15.isSelected()){
            
            ++totalItems;
            totalCost += 90;
        }
    }                                           

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox16.isSelected()){
            
            ++totalItems;
            totalCost += 100;
        }
    }                                           

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox12.isSelected()){
            
            ++totalItems;
            totalCost += 85;
        }
    }                                           

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox11.isSelected()){
            
            ++totalItems;
            totalCost += 90;
        }
    }                                           

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jCheckBox10.isSelected()){
            
            ++totalItems;
            totalCost += 80;
        }
    }                                           

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox9.isSelected()){
            
            ++totalItems;
            totalCost += 100;
        }
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        TotalPrice tp= new TotalPrice();
        
        this.dispose();
        tp.setTotalItems(totalItems);
        tp.setTotalPrice(totalCost);
        tp.setVisible(true);
    }                                        

    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration                   
}

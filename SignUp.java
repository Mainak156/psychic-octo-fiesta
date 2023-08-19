package com.mainaksen.airestaurant;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;



/**
 *
 * @author Mainak156
 */
public class SignUp extends javax.swing.JFrame {

    
    FileWriter fw;
    
    
    public SignUp() {      
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AI Restaurant");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(235, 180, 52));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(235, 180, 52));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TechFlavours Al Bistro");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 84));

        jLabel2.setBackground(new java.awt.Color(235, 180, 52));
        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign Up");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 690, 40));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 141, 165, 30));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("E-mail ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 183, 165, 30));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contact No: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 225, 165, 30));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 267, 165, 30));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirm Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 313, 165, 30));

        jTextField1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 141, 165, 30));

        jTextField2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 183, 165, 30));

        jTextField3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 225, 165, 30));

        jPasswordField1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jPasswordField1.setAutoscrolls(false);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 271, 165, 30));

        jPasswordField2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jPasswordField2.setAutoscrolls(false);
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 313, 165, 30));

        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\Next.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 374, 90, 40));

        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\reset.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 374, 90, 40));

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" Welcome to \"Techflavours al bistro\"! Step into");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 380, 27));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("future of gastronomy.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 380, 27));

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("a culinary experience like no other, where");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 380, 27));

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("cutting-edge technology and gourmet cuisine ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 380, 27));

        jLabel12.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("unite to create a dining adventure that");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 380, 27));

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("tantalizes both your taste buds and your");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 380, 27));

        jLabel14.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("curiosity. At TechFlavors AI Bistro, we're not");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 380, 27));

        jLabel15.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("just serving meals – we're serving up the");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 380, 27));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\AI Restaurant\\signuppagebg.jpg")); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 740, 550));

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        jTextField1.setText("");
        jTextField1.setForeground(Color.black);
        jTextField2.setText("");
        jTextField2.setForeground(Color.black);
        jTextField3.setText("");
        jTextField3.setForeground(Color.black);
        jPasswordField1.setText("");
        jPasswordField1.setForeground(Color.black);
        jPasswordField2.setText("");
        jPasswordField2.setForeground(Color.black);
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (jTextField1.getText().equals("")){
            jTextField1.setForeground(Color.red);
            jTextField1.setText("Field cannot be empty");
        } else if (jTextField2.getText().equals("")){
            jTextField2.setForeground(Color.red);
            jTextField2.setText("Field cannot be empty");
        } else if (jTextField3.getText().equals("")){
            jTextField3.setForeground(Color.red);
            jTextField3.setText("Field cannot be empty");
        } else if (jPasswordField1.getText().equals("")){
            jPasswordField1.setForeground(Color.red);
            jPasswordField1.setText("Field cannot be empty");
        } else if (jPasswordField2.getText().equals("")){
            jPasswordField2.setForeground(Color.red);
            jPasswordField2.setText("Field cannot be empty");
        } else if (jTextField1.getText().length()<3){
            jTextField1.setForeground(Color.red);
            jTextField1.setText("Field length cannot be less than 3");
        } else if (!(jTextField2.getText().substring(jTextField2.getText().indexOf(".")).equals(".com"))){
            jTextField2.setForeground(Color.red);
            jTextField2.setText("Invalid email ID.");
        } else if (jTextField3.getText().length() != 10){
            jTextField3.setForeground(Color.red);
            jTextField3.setText("Invalid Phone No.");
        } else if (!comparePassword(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
            jPasswordField1.setForeground(Color.red);
            jPasswordField1.setText("_____");
            jPasswordField2.setForeground(Color.red);
            jPasswordField2.setText("_____");
        } else if(jPasswordField1.getPassword().length < 3){
            jPasswordField1.setForeground(Color.red);
            jPasswordField1.setText("_____");
        } else if(!(checkForNumbers(jPasswordField2.getPassword()) ||
                checkForCaps(jPasswordField2.getPassword()) || 
                checkForSpclChars(jPasswordField2.getPassword()))){
            jPasswordField1.setForeground(Color.red);
            jPasswordField1.setText("_____");
        } else {
            try{
                fw= new FileWriter(jTextField1.getText()+".txt");
                fw.write(jTextField1.getText()+"\n");
                fw.append(jTextField2.getText()+"\n");
                fw.append(jTextField3.getText()+"\n");
                fw.append(Arrays.toString(jPasswordField2.getPassword())+"");
                fw.close();
            } catch(IOException e){}
            new AIRestaurant().setSigned(true);
            this.dispose();
            new MenuPage().setVisible(true);
        }
        
    }                                        

    boolean checkForNumbers(char[] password){
        
        boolean status= false;
        
        for (char c: password){
            
            if ((int)c >= 30 && (int)c <= 39){
                
                status= true;
                
            }
            
        }
        
        return status;
        
    }
    
    boolean checkForSpclChars(char[] password){
        
        boolean status= false;
        
        for (char c: password){
            
            if (c == '!' ||
                    c == '@'||
                    c == '#'||
                    c == '$'||
                    c == '&'||
                    c == '*'||
                    c == '('||
                    c == ')'||
                    c == '%'){
                
                status= true;
                
            }
            
        }
        
        return status;
        
    }
    
    boolean checkForCaps(char[] password){
        
        boolean status= false;
        
        for (char c: password){
            
            if (c >= 'A' && c <= 'Z'){
                
                status= true;
                
            }
            
        }
        
        return status;
        
    }
    
    boolean comparePassword(char[] a, char[] b){
        
        boolean status= false;
        
        if (a.length != b.length){
            return status;
        } else {
            for (int i= 0; i< a.length; i++){
                
                status = a[i] == b[i];
                
            }
        }
        
        return status;
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}

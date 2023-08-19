package com.mainaksen.airestaurant;

/**
 *
 * @author Mainak156
 */
public class AIRestaurant {

    static boolean signed= false;
    
    void setSigned(boolean SIGNED){
        
        signed= SIGNED;
        
    }
    
    boolean getSigned(){
        
        return signed;
        
    }
    
    public static void main(String[] args) {
        if (!signed){
            new SignUp().setVisible(true);
        } else {
            new Login().setVisible(true);
        }
    }
}

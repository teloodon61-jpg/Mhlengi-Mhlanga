/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;

/**
 *
 * @author Student
 */
public class RegistrationLoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args){
        
        RegistrationLogin key = new RegistrationLogin();
       
    System.out.println("REGISTRATION");
    System.out.println(key.registration());
    
    System.out.println("LOGIN");
    boolean loginStatus = key.loginPrompt();
    System.out.println(key.returnLoginStatus(loginStatus));
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class RegistrationLogin {
    
    static String username;
    static String password;
    static String cellphone;
    static Scanner input = new Scanner(System.in);
    
    public String registration(){
        String user = new String();
        
        System.out.println("Enter the username: ");
        username = input.nextLine();
      
        System.out.println("Enter the password: ");
        password = input.nextLine();
        
        System.out.println("Enter cellphone number: ");
        cellphone = input.nextLine();
    
      if(checkUsername(username)){
          System.out.println("Username Successfully Captured");
    }
      else {
              System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length");
      }
            if (checkPasswordComplexity(password)){
                System.out.println("Password Successfully Captured");
            }
            else {
                System.out.println("Password is not correctly formated; please ensure that your password contains at least 8 characters, a capital letter, a number and a special character");
            }
            if (checkCellPhoneNumber(cellphone)) {
                System.out.println("Cellphone number Successfully Captured");
            }
            else {
                System.out.println("Cellphone number is not correctly formated; please correct the number and try again.");
            }
        return "REGISTRATION SUCCESSFUL";
    
    }
        public static boolean checkUsername(String username){
            RegistrationLogin.username = username;
      if(username.contains("_")&&username.length()<=5){
          return true;
       }
       else {
       }
          return false;
    }
    
    public boolean checkPasswordComplexity(String password ){
       boolean length = password.length() >= 8;
       boolean hasUpper = password.matches(".*[A-Z].*");
       boolean hasDigit = password.matches(".*[0-9].*");
       boolean hasSpecial = password.chars().anyMatch(c-> !Character.isLetterOrDigit(c));
       
    
        return length && hasUpper && hasDigit && hasSpecial;
    }
    
    public boolean checkCellPhoneNumber(String cellphone){
      String regex = "^\\+27[0-9]{9}$";
        
      return cellphone.matches(regex);
    }
    
    public boolean loginPrompt() {
        System.out.println("Enter username");
        String enteredUsername = input.nextLine();
        
        System.out.println("Enter password");
        String enteredPassword = input.nextLine();
        
        return login(enteredUsername, enteredPassword);
    }
    public boolean login(String enteredUsername, String enteredPassword){
        return username.equals(enteredUsername)&& password.equals(enteredPassword);
    }
    
    public String returnLoginStatus(boolean LoginStatus){
        if (LoginStatus) { 
            return "Login Successful";
        }
        else {
            return "Login Failed, please try again";
        }
    }
}


    


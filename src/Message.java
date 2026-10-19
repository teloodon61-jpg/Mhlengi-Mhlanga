

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;
import java.util.*;

/**
 *
 * @author Student
 */
public class Message {

    static Scanner don = new Scanner(System.in);
    static RegistrationLogin log = new RegistrationLogin();

    public void working() {
        int Option;
        do {

            System.out.println("Welcome to QuickChat.");
            System.out.println("How many massages do you wish to send, Enter a set numbers");
            System.out.println("Option 1" + " -Send Messages");
            System.out.println("OPtion 2" + " -Coming soon.");
            System.out.println("Option 3" + " -Quit");
            Option = don.nextInt();

            if (Option == 1) {
                sendMessage();
                don.nextInt();
            } else if (Option == 2) {
                System.out.println("Coming soon");
            } else if (Option == 3) {
                System.out.println("Thanks for using Quick Chat");
            } else {
                System.out.println("ERROR!! Invalid Input");
            }
        }while (Option != 3);
    
    }

    public static void sendMessage() {
        
        Random ran = new Random();
     
    
        System.out.println("Enter the number of maseeges you want to enter");
        int count = don.nextInt();
        String messageL = don.nextLine();
        
        
        for(int i = 0; i < count; i++);
        int messageID = ran.nextInt();
        System.out.println("Enter Unique Message ID");
        String messageid = don.nextLine();
        while (messageid.length() > 10){
        System.out.println("Incorrect format, Enter the Unique Message ID again"); 
        messageid = don.nextLine();
        }
         
        String firstTwoNumbers = messageid.substring(0,2);
        String[] words = messageL.split(" ");
        int Count = words.length;
        
        String firstWord = words[0];
        String lastWord = words[Count - 1];
        
        String messageHash = firstTwoNumbers + ":" + Count + ":" + firstWord + lastWord;
        messageHash = messageHash.toUpperCase();
        System.out.println(messageHash);
        messageid = don.nextLine();
        
        don.nextLine();
        for(int i = 0; i < count; i++);
        System.out.println("Enter recipient number");
        String recNo = don.nextLine();
        while(!log.checkCellPhoneNumber(recNo)){
            System.out.println("Incorrect format, Enter recipient number again");
            recNo = don.nextLine();
        }
        System.out.println("Enter message");
        String message = don.nextLine();
        while (message.length() > 250){
            System.out.println("Incorrect format, Enter the message again");
            recNo = don.nextLine();
        }
        System.out.println("Choose an option: ");
        System.out.println("1. Send Message");
        System.out.println("2. Diregard massege");
        System.out.println("3. Store message to send later");
        
        System.out.println("Enter your option: ");
        int option = don.nextInt();
        
        switch (option){
            case 1:
                System.out.println("Message successfully sent");
                break;
            case 2:
                System.out.println("Press 0 to delete the message");
                int delete = don.nextInt();
                
            if (delete == 0){
                System.out.println("Message deleted");
            }
            else{
                System.out.println("Message not deleted");
            }
                break;
            case 3:
                System.out.println("Message successfully stored");
                break;
            default:
                System.out.println("Invalid option");
                don.close();
            }
                
        }
}
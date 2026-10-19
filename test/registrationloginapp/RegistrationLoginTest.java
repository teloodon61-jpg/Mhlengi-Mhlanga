/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registrationloginapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class RegistrationLoginTest {
    
    public RegistrationLoginTest() {
    }
    public void testValidUsername() {
        System.out.println("Check Username");
        RegistrationLogin instance = new RegistrationLogin();
        instance.username = "telo_";
        boolean expResult = true;
        boolean result = instance.checkUsername(instance.username);
        assertEquals(expResult, result);
     
    }
    public void testInValidUsername() {
        System.out.println("Check Username");
        RegistrationLogin instance = new RegistrationLogin();
        instance.username = "donteloy";
        boolean expResult = false;
        boolean result = instance.checkUsername(instance.username);
        assertEquals(expResult, result);

    
    }
    public void testValidPassword() {
        System.out.println("Check Password");
        RegistrationLogin instance = new RegistrationLogin();
        instance.password = "Donte9@*";
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(instance.password);
        assertEquals(expResult, result);
    }
    public void testInValidPassword() {
        System.out.println("Check Password");
        RegistrationLogin instance = new RegistrationLogin();
        instance.password = "Donte9oolo";
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(instance.password);
        assertEquals(expResult, result);
    }
    public void testValidCellphone() {
        System.out.println("Check cellphone");
        RegistrationLogin instance = new RegistrationLogin();
        instance.cellphone = "+27737009834";
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(instance.cellphone);
        assertEquals(expResult, result);
    }
    public void testInValidCellphone() {
        System.out.println("Check cellphone");
        RegistrationLogin instance = new RegistrationLogin();
        instance.cellphone = "0737009834";
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(instance.cellphone);
        assertEquals(expResult, result);
    }
    }

    
    
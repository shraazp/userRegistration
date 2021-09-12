package com.user.registration;
import java.util.*;
import org.junit.*;
public class UserEntryTest2 {
       
        Scanner sc = new Scanner(System.in);
        
        @Test
        public void testFirstName() {
            UserRegistrationValidation userValidation = new UserRegistrationValidation();
            boolean result;
            String firstName = sc.next();
            try {
                result = userValidation.nameValidate(firstName);
                Assert.assertEquals(true,result);
            } catch (UserValidationException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        
        @Test
        public void testLastName() {
            UserRegistrationValidation userValidation = new UserRegistrationValidation();
            boolean result;
            String lastName = sc.next();
            try {
                result = userValidation.LastNamevalidate(lastName);
                Assert.assertEquals(true,result);
            } catch (UserValidationException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        
        @Test
        public void testEmail() {
            UserRegistrationValidation userValidation = new UserRegistrationValidation();
            boolean result;
            String email = sc.next();
            try {
                result = userValidation.emailValidate(email);
                Assert.assertEquals(true,result);
            } catch (UserValidationException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        
        @Test
        public void testMobile() {
            UserRegistrationValidation userValidation = new UserRegistrationValidation();
            boolean result;
            String mobile = sc.nextLine();
            try {
                result = userValidation.mobileValidate(mobile);
                Assert.assertEquals(true,result);
            } catch (UserValidationException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        
        @Test
        public void testPassword() {
            UserRegistrationValidation userValidation = new UserRegistrationValidation();
            boolean result;
            String password = sc.next();
            try {
                result = userValidation.passwordValidate(password);
                Assert.assertEquals(true,result);
            } catch (UserValidationException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
    }


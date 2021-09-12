package com.user.registration;
import java.util.regex.*;
/**
 * A class containing user  information 
 * @author Shravya P
 *
 */
public class UserRegistrationValidation {
	/**
	 * function to check if user's first name or last name is proper or not 
	 * @param firstname first name or last name given by user
	 * @return true if first name follows rules or else false
	 */
	public Boolean nameValidate(String name)throws UserValidationException
	{
		String regex="^[A-Z][A-Za-z0-9]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Boolean result= pattern.matcher(name).matches();
		if(result==true)
		    return true;
		else
		    throw new UserValidationException("Enter valid First Name");
		
	}
	/*method to validate the last name
     * entered by the user
     */
    public boolean LastNamevalidate(String lastName)throws UserValidationException
    {
        String pattern = "^[A-Z][a-zA-Z]{2,}";
        boolean result = Pattern.matches(pattern, lastName);
        if(result == true) {
            return true;
        }else {
            throw new UserValidationException("Enter valid Last Name");
        }
    }
	/**
	 * function to check if email is valid or not
	 * @param email entered by user
	 * @return true or false
	 */
	public Boolean emailValidate(String email)throws UserValidationException
	{
			String regex = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
			Pattern pattern = Pattern.compile(regex);
			Boolean result=pattern.matcher(email).matches();
			if(result==true)
	            return true;
	        else
	            throw new UserValidationException("Enter valid email");
		
			
	}
	/**
	 * function to check if mobile number is proper or not
	 * @param mobile entered by user
	 * @return true or false
	 */
	public Boolean mobileValidate(String mobile) throws UserValidationException
	{
		
			String regex = "91 [1-9][0-9]{9}";
			Pattern pattern = Pattern.compile(regex);
			Boolean result=pattern.matcher(mobile).matches();
			if(result==true)
                return true;
            else
                throw new UserValidationException("Enter valid mobile number");
			
	}
	/**
	 * function to check for password validation
	 * @param password password given by user
	 * @return true or false
	 */
	public Boolean passwordValidate(String password) throws UserValidationException
	{
			String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Boolean result= pattern.matcher(password).matches();	
			if(result==true)
                return true;
            else
                throw new UserValidationException("Enter a strong password");
	}
}

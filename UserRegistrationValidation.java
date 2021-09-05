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
	 * @return true if first name or last name follows rules or else false
	 */
	public Boolean nameValidate(String name)
	{
		if(!Character.isUpperCase(name.charAt(0)))
		{
			return false;
		}
		else if(name.length()<3)
		{
			return false;
		}
		else
			return true;
	}
	/**
	 * function to check if email is valid or not
	 * @param email entered by user
	 * @return true or false
	 */
	public Boolean emailValidate(String email)
	{
		if(email==null)
			return false;
		else
		{
			String regex = "^(.+)@(.+)\\.(.+)$";
			Pattern pattern = Pattern.compile(regex);
			return pattern.matcher(email).matches();
		}
			
	}
	/**
	 * function to check if mobile number is proper or not
	 * @param mobile entered by user
	 * @return true or false
	 */
	public Boolean mobileValidate(String mobile)
	{
		if(mobile==null)
			return false;
		else
		{
			String regex = "91 [1-9][0-9]{9}";
			Pattern pattern = Pattern.compile(regex);
			return pattern.matcher(mobile).matches();
		}
			
	}
	
	public Boolean passwordValidate(String password)
	{
		if(password.length()<8)
			return false;
		else if(password.equals(password.toLowerCase()))
			return false;
		return true;
	}
}

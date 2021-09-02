package com.user.registration;
/**
 * A class containing user  information 
 * @author Shravya P
 *
 */
public class UserRegistrationValidation {
	/**
	 * function to check if user's first name is proper or not 
	 * @param firstname first name given by user
	 * @return true if first name follows rules or else false
	 */
	public Boolean firstNameValidate(String firstname)
	{
		if(!Character.isUpperCase(firstname.charAt(0)))
		{
			
			return false;
		}
		else if(firstname.length()<3)
		{
			return false;
		}
		else
			return true;
	}
	
}

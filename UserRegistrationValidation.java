package com.user.registration;
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
}

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
		String regex="^[A-Z][A-Za-z0-9]{3,}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(name).matches();
	}
	
}

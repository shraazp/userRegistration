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
		String regex="^[A-Z][A-Za-z0-9]{3,}";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(name).matches();
	}
}

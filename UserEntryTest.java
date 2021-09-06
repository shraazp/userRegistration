package com.user.registration;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class UserEntryTest {
	String firstName="Shravya";
	String lastName="P";
	String email="shravya.p@ymedialabs.com";
	String mobile="91 9919819801";
	String password="risHkesh9#";
			
	@Test
	public void userEntryValidate()
	{
		UserRegistrationValidation user=new UserRegistrationValidation();
		assertEquals(true,user.nameValidate(firstName) );
		assertEquals(false,user.nameValidate(lastName) );
		assertEquals(true,user.emailValidate(email));
		assertEquals(true,user.mobileValidate(mobile));
		assertEquals(true,user.passwordValidate(password));
	}

}
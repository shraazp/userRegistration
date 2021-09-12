package com.user.registration;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class UserEntryTest {
	String firstName;
	String lastName;
	String email;
	String mobile;
	String password;
	Boolean expectedResult;
	UserRegistrationValidation userEntry;
	@Before
	public void initialize()
	{
		userEntry=new UserRegistrationValidation();
	}	
	public UserEntryTest(String email,Boolean expectedResult)
	{
		this.firstName="Shravya";
		this.lastName="p";
		this.mobile="91 9902194739";
		this.password="Shra9@vyap";
		this.email=email;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(
				new Object[][] {
					{"abc@yahoo.com",true},
					{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},
					{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},
					{"abc@1.com",true},{"abc@gmail.com.com",true},
					{"abc+100@gmail.com",true},{"abc",false},{"abc@.com.my",false},
					{"abc123@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},
					{".abc@abc.com",false},{"abc()*@gmail.com",false},{"abc@%*.com",false},{"abc..2002@gmail.com",false},
					{"abc.@gmail.com",false},{"abc@abc@gmail.com",false},{"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}
							});
	}
	@Test
	public void userEntryValidate()
	{
		UserRegistrationValidation user=new UserRegistrationValidation();
		assertEquals(true,user.nameValidate(firstName) );
		assertEquals(false,user.nameValidate(lastName) );
		assertEquals(expectedResult,user.emailValidate(email));
		assertEquals(true,user.mobileValidate(mobile));
		assertEquals(true,user.passwordValidate(password));
	}

}
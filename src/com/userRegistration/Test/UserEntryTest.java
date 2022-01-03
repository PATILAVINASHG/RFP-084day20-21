package com.userRegistration.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals(true, userEntry.firstName("Avinash"));
		assertEquals(true , userEntry.lastName("Patil"));
		assertEquals(true , userEntry.contactNumber("91 8983603275"));
		assertEquals( false , userEntry.contactNumber("patilavinash223@gmail.com"));
	}
}
	
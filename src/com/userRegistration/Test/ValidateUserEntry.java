package com.userRegistration.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserEntry {
	
	public boolean firstName(String inputStr1) {
		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);
		Matcher firstNameMatcher = regex.matcher(inputStr1);
		if (firstNameMatcher.matches()) {
			System.out.println(inputStr1);
			return true;
		} else {
			System.out.println(inputStr1 + "\n is invalid first name.Kindly input the right one.");
			return false;
		}
	//	return false;
	}

	public boolean lastName(String inputStr2) {
		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);
		;
		Matcher firstNameMatcher = regex.matcher(inputStr2);
		if (firstNameMatcher.matches()) {
			System.out.println(inputStr2);
			return true;
		} else {
			System.out.println(inputStr2 + " \nis invalid last name.Kindly input the right one.");
			return false;
		}
		
	}

	public boolean contactNumber(String inputStr3) {
		String contactNumPattern ="^[0-9]{0,2}\s[0-9]{10}$";
		Pattern regex = Pattern.compile(contactNumPattern);
		Matcher contactNumMatcher = regex.matcher(inputStr3);
		if (contactNumMatcher.matches()) {
			System.out.println(inputStr3);
			return true ;
		} else {
			System.out.println(inputStr3 + " \nis invalid contact number.Kindly input the right one.");
			return false;
		}
		
	}

	public boolean emailID(String inputStr4) {
		String mailPattern =  "^[a-z]{2,30}@{1}[a-z]{3,10}.[a-z]{3}$";
		Pattern regex = Pattern.compile(mailPattern);
		Matcher emailIDMatcher = regex.matcher(inputStr4);
		if (emailIDMatcher.matches()) {
			System.out.println(inputStr4);
			return true;
		} else {
			System.out.println(inputStr4 + " \nis invalid mail address.Kindly input the right one.");
			return false;
		}
		
	}

	public static void main(String[] args) {
		ValidateUserEntry psswrd = new ValidateUserEntry();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String inputStr1 = sc.nextLine();
		System.out.print("Enter the last name : ");
		String inputStr2 = sc.nextLine();
		System.out.print("Enter the contact number : ");
		String inputStr3 = sc.nextLine();
		System.out.print("Enter the mail ID number : ");
		String inputStr4 = sc.nextLine();

		sc.close();
		System.out.println(" || USER ENTRY ||");
		psswrd.firstName(inputStr1);
		psswrd.lastName(inputStr2);
		psswrd.contactNumber(inputStr3);
		psswrd.emailID(inputStr4);

	}
}
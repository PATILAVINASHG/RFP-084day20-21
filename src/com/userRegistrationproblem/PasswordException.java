package com.userRegistrationproblem;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the contact number : ");

		String namePattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
		Pattern regex = Pattern.compile(namePattern);
		String inputStr = sc.nextLine();
		Matcher contactNumMatcher = regex.matcher(inputStr);
		try {
			int val = Integer.parseInt("Priyanka");
			sc.close();
			System.out.print(val);

			if (contactNumMatcher.matches()) {
				System.out.println(inputStr + "\nis valid password.");
			} else {
				System.out.println(inputStr + "\nis invalid password.Kindly input the right one.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}
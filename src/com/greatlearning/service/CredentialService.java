package com.greatlearning.service;
import java.util.Random;
public class CredentialService {

	private String emailAddress,pass;
	char[] password;
	
	public String generateEmailAddress(int number,String firstName,String lastName) {
		
		switch(number) {
		case 1:
			emailAddress=firstName+lastName+"@tech.abc.com";
			break;
		case 2:
			emailAddress=firstName+lastName+"@admin.abc.com";
			break;
		case 3:
			emailAddress=firstName+lastName+"@hr.abc.com";
			break;
		case 4:
			emailAddress=firstName+lastName+"@legal.abc.com";
			break;
		}
		emailAddress=emailAddress.toLowerCase();
		return emailAddress;
	}
	
	public void generatePassword() {
		
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      password = new char[8];
	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	      for(int i = 4; i< 8 ; i++) {
	          password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	       }
	      pass=String.valueOf(password);
	}

	public String showCredentials() {
		return pass;
	}

}

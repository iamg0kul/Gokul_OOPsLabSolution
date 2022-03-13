package com.greatlearning.entrypoint;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Main {

	public static void main(String[] args) {
		
		String firstName,lastName;
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first name of new joinee: ");
		firstName=sc.nextLine();
		System.out.print("Enter last name of new joinee: ");
		lastName=sc.nextLine();
		
		Employee emp=new Employee(firstName,lastName);
		CredentialService cred=new CredentialService();
		boolean correctInput=false; 
		System.out.println("\nPlease enter the departement from the following,");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		do {
			number=sc.nextInt();
			if(number>4) {
				System.out.print("\nINCORRECT INPUT, PLEASE ENTER CORRECT INPUT: ");
				correctInput=true;
			}
			else {
				correctInput=false;
			}
		}while(correctInput);
		
		System.out.println("\nDear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email -------> "+cred.generateEmailAddress(number,firstName,lastName));
		cred.generatePassword();
		System.out.println("Password ----> "+cred.showCredentials());
		sc.close();
	}

}


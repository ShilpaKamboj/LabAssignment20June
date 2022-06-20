package greatlearning.service;

import java.util.Scanner;

import greatlearning.model.Employee;

public class DriverClass {
   
	public static void main(String [] args) {
		
		Employee employee = new Employee("Shilpa", "kamboj");
		
		CredentialService credentialService = new CredentialService();
		
		String generatedEmail;
		char[] generatedpassword;
		
		System.out.println("Please enter the department from the following");
		
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if(option==1)
		{
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
			generatedpassword = credentialService.generatePassword();
			CredentialService.showCredential(employee, generatedEmail, generatedpassword);
		}
		else if(option ==2)
		{
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName());
			generatedpassword = credentialService.generatePassword();
			CredentialService.showCredential(employee, generatedEmail, generatedpassword);
		}
		
		  else if(option ==3){
		  generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
		  generatedpassword = credentialService.generatePassword();
		  CredentialService.showCredential(employee, generatedEmail, generatedpassword);
	     }
	      else if (option ==4){
	   generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"tech");
	   generatedpassword = credentialService.generatePassword();
	   CredentialService.showCredential(employee, generatedEmail, generatedpassword);
         }
	      else {
	    	  System.out.println("Enter a valid option");
	      }
		sc.close();

		}	
		
	}

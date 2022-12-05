package service;

import java.util.Random;

import interfaces.EmployeeCreds;
import model.Employee;

public class CredentialService implements EmployeeCreds {
	
	@Override
	public String generatEmailAddress(String fname, String lname, String dept) {
		
		return fname+lname+"@"+dept+".google.com";
	}
	
	@Override
	public String generatePassword() {
		
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String special = "~!@#$%^^&**(){}[];:'.,<>/?";
		String numbers = "1234567890";
		
		String values = capital + small + special + numbers;
		
		Random random = new Random();
		
		String password = "";
		char temp;
		
		for(int i = 0; i < 8; i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		return password;
	}
	
	@Override
	public void showCredentials(Employee emp) {
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email  ---> "+emp.getEmail());
		System.out.println("Password  ---> "+emp.getPassword());
	}
	
}

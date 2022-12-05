package Main;

import interfaces.EmployeeCreds;
import model.Employee;
import service.CredentialService;


import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EmployeeCreds cred = new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		String getemail = null, getpwd = null;
		
		Employee emp = new Employee("Ashutosh","Bhaskar");
		
		switch(option) {
		case 1 :
			getemail = cred.generatEmailAddress(emp.getFirstName(), emp.getLastName(),"tech");
			getpwd = cred.generatePassword();
			break;
		case 2 :
			getemail = cred.generatEmailAddress(emp.getFirstName(), emp.getLastName(),"admin");
			getpwd = cred.generatePassword();
			break;
		case 3 :
			getemail = cred.generatEmailAddress(emp.getFirstName(), emp.getLastName(),"hr");
			getpwd = cred.generatePassword();
			break;
		case 4 :
			getemail = cred.generatEmailAddress(emp.getFirstName(), emp.getLastName(),"legal");
			getpwd = cred.generatePassword();
			break;
		default: 
			System.out.println("Please choose a valid option!");
		}
		emp.setEmail(getemail);
		emp.setPassword(getpwd);
		cred.showCredentials(emp);
		sc.close();
	}

}

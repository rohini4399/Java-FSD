package interfaces;

import model.Employee;

public interface EmployeeCreds {
	
	public String generatEmailAddress(String fname, String lname, String dept);
	
	public String generatePassword();
	
	public void showCredentials(Employee emp);

}

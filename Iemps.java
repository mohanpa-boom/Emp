package service;

import java.time.LocalDate;
import java.util.List;

import beans.Emp;

public interface Iemps {
	public boolean validateEmpId(String empId);
	public boolean validateSalary(double sal);
	public boolean validateName(String name);
	public boolean vaidateJoinDate(LocalDate date);
	
	public void createEmployee(Emp emp);
	public List<Emp> getEmployees();

}

package service;

import java.time.LocalDate;
import java.util.List;

import beans.Emp;
import dao.Empdao;
import dao.Iempdao;

public class Emps implements Iemps{
	
	Iempdao dao = new Empdao();
	

	@Override
	public boolean validateEmpId(String empId) {
		String regex = "^[0-9]{5}_[A-Z]{2}$";
		return empId.matches(regex);
	}

	@Override
	public boolean validateSalary(double sal) {
		return (sal>=20000 && sal<= 500000);
	}

	@Override
	public boolean validateName(String name) {
		return name.matches("^[A-Za-z]{3,}$");
	}

	@Override
	public boolean vaidateJoinDate(LocalDate date) {
		int flag = date.compareTo(LocalDate.now());
		return (flag>=0);
	}

	@Override
	public void createEmployee(Emp emp) {
		dao.createEmployee(emp);
		
	}
	public List<Emp> getEmployees(){
		return dao.getEmployees();
	}

}

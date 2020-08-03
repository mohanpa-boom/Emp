package dao;

import java.util.ArrayList;
import java.util.List;

import beans.Emp;

public class Empdao implements Iempdao{
	
	List<Emp> employees = new ArrayList<Emp>();

	@Override
	public void createEmployee(Emp emp) {
		employees.add(emp);
		System.out.println("Employee is created");
		
	}

	public List<Emp> getEmployees() {
		return employees;
	}

}
	
package dao;

import java.util.List;

import beans.Emp;

public interface Iempdao {
	public void createEmployee(Emp emp);
	public List<Emp> getEmployees();

}

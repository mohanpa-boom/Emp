package beans;

import java.time.LocalDate;
import java.util.List;

public class Emp {
	private String empId;
	private String firstName;
	private String lastName;
	private double salary;
	private LocalDate dateOfJoin;
	
	private List<Address> address;
	private Dept department;
	public Emp(String empId, String firstName, String lastName, double salary, LocalDate dateOfJoin,
			List<Address> address, Dept department) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
		this.address = address;
		this.department = department;
	}
	public Emp() {
		super();
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Dept getDepartment() {
		return department;
	}
	public void setDepartment(Dept department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", dateOfJoin=" + dateOfJoin + ", address=" + address + ", department=" + department + "]";
	}
	
}

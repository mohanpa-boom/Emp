package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import beans.Address;
import beans.Dept;
import beans.Emp;
import service.Emps;
import service.Iemps;

public class Main {
	public static void main(String[] args) {
		Iemps service = new Emps();
		Emp employee = null;
		Dept department = null;
		List<Address> address = null;
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
		  System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("Select an option and press enter");
		  System.out.println("1. Add/Save Employee");
		  System.out.println("2. Emp ID");
		  System.out.println("3. First Name");
		  System.out.println("4. Last Name");
		  System.out.println("5. Salary");
		  System.out.println("6. Address");
		  System.out.println("7. Deptt");
		  System.out.println("8. Exit");
			System.out.println("-------");
			
			switch(sc.nextInt()) {
			
			case 1 :
				System.out.println("Enter emp id(99760) : ");
				String empId = sc.next();
				if(service.validateEmpId(empId)) {
					employee = new Emp();
					employee.setEmpId(empId);
				}else {
					System.out.println("Invalid employee Id format");
					break;
				}
				System.out.println("Enter First name : ");
				String fname = sc.next();
				if(service.validateName(fname)) {
					employee.setFirstName(fname);
				}else {
					System.out.println("Invalid employee First Name format ");
					break;
				}
				System.out.println("Enter Last Name : ");
				String lname = sc.next();
				if(service.validateName(lname)) {
					employee.setLastName(lname);
				}else {
					System.out.println("Invalid employee First Last format ");
					break;
				}
				System.out.println("Enter salary (range:10k to 80k) : ");
				double sal = sc.nextDouble();
				if(service.validateSalary(sal)) {
					employee.setSalary(sal);
				}else {
					System.out.println(" Invalid Salary range");
					break;
				}
				System.out.println("Enter joining date ('yyyy-MM-dd'): ");
				String joinDate =  sc.next();
				LocalDate date = LocalDate.parse(joinDate);
				if(service.vaidateJoinDate(date)) {
					employee.setDateOfJoin(date);
				}else {
					System.out.println("date of joining should be today day");
					break;
				}
				department = new Dept();
				System.out.println("Enter dept Id : ");
				int deptId = sc.nextInt();
				department.setDeptId(deptId);
				System.out.println("Enter dept name : ");
				department.setDeptName(sc.next());
				System.out.println("Enter location : ");
				department.setLocation(sc.next());
				
				employee.setDepartment(department);
				
				System.out.println("Enter the number of address");
				int n = sc.nextInt();
				address = new ArrayList<Address>(n);
				for(int i=0;i<n;i++) {
					Address add = new Address();
					System.out.println("Enter address Id : ");
					add.setAddressId(sc.nextInt());
					System.out.println("Enter address1 : ");
					add.setAddress1(sc.next());
					System.out.println("Enter city : ");
					add.setCity(sc.next());
					System.out.println("Enter state : ");
					add.setState(sc.next());
					address.add(add);
				}
				employee.setAddress(address);
				service.createEmployee(employee);
				break;
				
				
				
			case 2 : 
				
				
					System.out.println("Emp Id in ascending order :");
					Comparator<Emp> Id = new Comparator<Emp>() {
						
						@Override
						public int compare(Emp e1, Emp e2) {
							return e1.getEmpId().compareTo(e2.getEmpId());
						}
					};
					Collections.sort(service.getEmployees(),Id);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
					
					
			case 3 :
				
				
					System.out.println("Emp First Name in ascending order :");
					Comparator<Emp>Name = new Comparator<Emp>() {
						
						@Override
						public int compare(Emp e1, Emp e2) {
							return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
						}
					};
					Collections.sort(service.getEmployees(),Name);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
					
					
			case 4 : 
				
					System.out.println("Last Name in ascending order :");
					Comparator<Emp> LastName = new Comparator<Emp>() {
					
						@Override
						public int compare(Emp e1, Emp e2) {
							return e1.getLastName().compareToIgnoreCase(e2.getLastName());
						}
					};
					Collections.sort(service.getEmployees(),LastName);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
					
			
			case 5 : 
				
				
					System.out.println("Salary in descending order : ");
					Comparator<Emp> Sal = new Comparator<Emp>() {
						public int compare(Emp e1, Emp e2) {
							if(e1.getSalary()<e2.getSalary())
								return 1;
							else if(e1.getSalary()>e2.getSalary())
								return -1;
							else
								return 0;
						}
					};
					Collections.sort(service.getEmployees(),Sal);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
			case 6 : 
					System.out.println("Address : ");
					for(Emp e : service.getEmployees()) {
						Collections.sort(  e.getAddress(),new Comparator<Address>(){
							public int compare(Address add1,Address add2) {
								return add1.getAddressId()-add2.getAddressId();
							}
						} 
						);
					}
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
			
			case 7 :
					System.out.println("Dept Id in ascending order :");
					Comparator<Emp> DeptId = new Comparator<Emp>() {
						@Override
						public int compare(Emp e1, Emp e2) {
							return e1.getDepartment().getDeptId()-e2.getDepartment().getDeptId();
						}
					};
					Collections.sort(service.getEmployees(),DeptId);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					
					System.out.println("Name in ascending order :");
					Comparator<Emp> DeptName = new Comparator<Emp>() {
						@Override
						public int compare(Emp e1, Emp e2) {
							return e1.getDepartment().getDeptName().compareToIgnoreCase(e2.getDepartment().getDeptName());
						}
					};
					Collections.sort(service.getEmployees(),DeptName);
					for(Emp emp : service.getEmployees())
						System.out.println(emp);
					break;
			
			case 8 : 
					System.out.println("Thank U !!!.");break;
			}		
		}
		

	}


}

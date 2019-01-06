package tanerus.designpattern.structural.adapter.realdemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "jw@wick.com");

		employees.add(employeeFromDB);

		// Will not work! This is where the adapter comes into play!
		//Employee employeeFromLdap = new EmployeeLdap("chty","Solo","Wan","han@solo.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chty","Solo","Wan","han@solo.com");
		
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
	}

}

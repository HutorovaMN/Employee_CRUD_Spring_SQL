package maryhutor.spring.Service;

import java.util.List;

import maryhutor.spring.Entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);

}

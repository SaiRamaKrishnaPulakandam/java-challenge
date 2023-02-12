package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeService {
    

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);
	
    public void deleteEmployee(Long employeeId);
	
    public void updateEmployee(Employee employee);
}
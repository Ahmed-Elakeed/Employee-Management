package miu.edu.asd.employee_management.service;

import miu.edu.asd.employee_management.domain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void deleteEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
}

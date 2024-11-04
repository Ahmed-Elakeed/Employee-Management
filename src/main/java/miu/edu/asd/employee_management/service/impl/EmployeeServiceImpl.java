package miu.edu.asd.employee_management.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.asd.employee_management.domain.Employee;
import miu.edu.asd.employee_management.repository.EmployeeRepository;
import miu.edu.asd.employee_management.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        this.employeeRepository.delete(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return this.employeeRepository.findById(id).orElse(null);
    }
}

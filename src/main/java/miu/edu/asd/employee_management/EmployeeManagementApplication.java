package miu.edu.asd.employee_management;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import miu.edu.asd.employee_management.domain.Employee;
import miu.edu.asd.employee_management.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.stream.Collectors;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeManagementApplication implements CommandLineRunner {

    private final EmployeeService employeeService;

    @PostConstruct
    private void init() {
        this.employeeService.createEmployee(
                Employee.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .salary(50000)
                        .build()
        );
        this.employeeService.createEmployee(
                Employee.builder()
                        .firstName("Jane")
                        .lastName("Dona")
                        .salary(50000)
                        .build()
        );
        this.employeeService.createEmployee(
                Employee.builder()
                        .firstName("Alice")
                        .lastName("Smith")
                        .salary(60000)
                        .build()
        );
        this.employeeService.createEmployee(
                Employee.builder()
                        .firstName("Bob")
                        .lastName("Brown")
                        .salary(45000)
                        .build()
        );

    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeService.getAllEmployees().stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(
                        Employee::getLastName, Comparator.reverseOrder()
                )).toList().forEach(System.out::println);
    }
}

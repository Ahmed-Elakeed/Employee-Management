package miu.edu.asd.employee_management.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private Integer salary;

}

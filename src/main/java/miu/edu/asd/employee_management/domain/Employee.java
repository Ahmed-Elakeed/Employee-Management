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
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "salary", nullable = false)
    private Integer salary;

}

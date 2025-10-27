package fr.takima.devops.myapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL
    private Long id;

    // Mappe first_name -> firstName
    @Column(name = "first_name", nullable = false, length = 20)
    @JsonProperty("firstname") // pour rester conforme à l’output attendu
    private String firstName;

    // Mappe last_name -> lastName
    @Column(name = "last_name", nullable = false, length = 20)
    @JsonProperty("lastname") // pour rester conforme à l’output attendu
    private String lastName;

    // FK department_id -> departments(id)
    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Student() {}

    public Student(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    // Getters / Setters
    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Department getDepartment() { return department; }

    public void setId(Long id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setDepartment(Department department) { this.department = department; }
}
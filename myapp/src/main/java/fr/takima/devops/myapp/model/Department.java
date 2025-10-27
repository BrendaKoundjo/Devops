package fr.takima.devops.myapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    // Relation 1..N vers students (clé étrangère sur students.department_id)
    @JsonIgnore // évite la récursion JSON (Department -> students -> department -> ...)
    @OneToMany(mappedBy = "department")
    private List<Student> students;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    // Getters / Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Student> getStudents() { return students; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStudents(List<Student> students) { this.students = students; }
}
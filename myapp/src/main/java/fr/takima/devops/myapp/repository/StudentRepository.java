package fr.takima.devops.myapp.repository;


import fr.takima.devops.myapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartment_NameIgnoreCase(String departmentName);
}
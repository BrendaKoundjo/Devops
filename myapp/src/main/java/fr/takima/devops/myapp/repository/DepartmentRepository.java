package fr.takima.devops.myapp.repository;


import fr.takima.devops.myapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByNameIgnoreCase(String name);
}

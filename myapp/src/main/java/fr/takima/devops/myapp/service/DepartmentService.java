package fr.takima.devops.myapp.service;

import fr.takima.devops.myapp.model.Student;
import fr.takima.devops.myapp.model.Department;
import fr.takima.devops.myapp.repository.StudentRepository;
import fr.takima.devops.myapp.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
    public DepartmentService(StudentRepository studentRepository,DepartmentRepository departmentRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository=departmentRepository;
    }
    public List<Student> getStudentsByDepartment(String departmentName) {
        return studentRepository.findByDepartment_NameIgnoreCase(departmentName);
    }
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
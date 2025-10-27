package fr.takima.devops.myapp.controller;

import fr.takima.devops.myapp.model.Student;
import fr.takima.devops.myapp.model.Department;
import fr.takima.devops.myapp.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
    @GetMapping("/{departmentName}/students")
    public List<Student> getStudentsByDepartment(@PathVariable String departmentName) {
        return departmentService.getStudentsByDepartment(departmentName);
    }

}

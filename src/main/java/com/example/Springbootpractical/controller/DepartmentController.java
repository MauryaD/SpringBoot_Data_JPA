package com.example.Springbootpractical.controller;

import com.example.Springbootpractical.entity.Department;
import com.example.Springbootpractical.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department>  getAllDepartmentList(){
        return departmentService.getAllDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentDetails(@PathVariable("id") Long departmentId, @Valid @RequestBody Department department ){
        return departmentService.updateDepartmentDetails(departmentId, department);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentDetailsById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentDetails(departmentId);
        return "Operation succesfull!!";
    }

    @GetMapping("/departments/name/{name}")
    public List<Department> getDepartmentsByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentsByName(departmentName);
    }
}

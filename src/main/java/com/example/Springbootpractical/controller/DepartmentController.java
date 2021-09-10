package com.example.Springbootpractical.controller;

import com.example.Springbootpractical.entity.Department;
import com.example.Springbootpractical.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department>  getAllDepartmentList(){
        return departmentService.getAllDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }
}

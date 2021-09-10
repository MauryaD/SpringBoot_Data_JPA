package com.example.Springbootpractical.service;


import com.example.Springbootpractical.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getAllDepartmentList();

    public Department getDepartmentById(Long id);

    public void deleteDepartmentDetails(Long departmentId);

    public Department updateDepartmentDetails(Long departmentId, Department department);
}

package com.example.Springbootpractical.repository;

import com.example.Springbootpractical.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public List<Department> findAllByDepartmentName(String departmentName);
}

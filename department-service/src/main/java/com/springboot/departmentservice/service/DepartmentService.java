package com.springboot.departmentservice.service;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findById(Long departmentId) {
        Optional<Department> byId = departmentRepository.findById(departmentId);
        return byId.orElse(null);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}

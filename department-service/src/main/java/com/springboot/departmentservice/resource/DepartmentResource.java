package com.springboot.departmentservice.resource;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments/")
public class DepartmentResource {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") String id){
     Long departmentId =   Long.valueOf(id);
     return departmentService.findById(departmentId);
    }

    @PostMapping()
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
}

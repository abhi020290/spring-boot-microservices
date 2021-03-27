package com.springboot.departmentservice.resource;

import com.springboot.departmentservice.entity.Department;
import com.springboot.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
public class DepartmentResource {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") String id){
     Long departmentId =   Long.valueOf(id);
     return ResponseEntity.ok(departmentService.findById(departmentId));
    }

    @PostMapping("/")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return ResponseEntity.ok(departmentService.saveDepartment(department));

    }
}

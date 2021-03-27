package com.springboot.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackResource {

    @GetMapping("/fallbackUserService")
    public String fallbackUserService(){
        return "User service is down";
    }

    @GetMapping("/fallbackDepartmentService")
    public String fallbackDepartmentService(){
        return "Department service is down";
    }
}

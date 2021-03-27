package com.springboot.userservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentDetails;
}

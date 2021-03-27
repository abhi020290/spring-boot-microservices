package com.springboot.userservice.pojo;

import com.springboot.userservice.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDepartmentVO {
    private Department department;
    private User user;

}

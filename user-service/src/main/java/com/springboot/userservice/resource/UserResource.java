package com.springboot.userservice.resource;

import com.springboot.userservice.entity.User;
import com.springboot.userservice.pojo.UserDepartmentVO;
import com.springboot.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
        Long aLong = Long.valueOf(id);
         return ResponseEntity.ok(userService.getUserById(aLong));
    }

    @PostMapping("/")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        log.info("User Resource saveUser");
        return ResponseEntity.ok(userService.saveUser(user));

    }

    @GetMapping("/departments/{id}")
    public ResponseEntity<UserDepartmentVO> getUserWithDepartment(@PathVariable("id") String id) {
        Long aLong = Long.valueOf(id);
        return ResponseEntity.ok(userService.getUserWithDepartment(aLong));

    }

}

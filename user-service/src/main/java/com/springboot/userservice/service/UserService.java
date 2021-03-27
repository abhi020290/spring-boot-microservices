package com.springboot.userservice.service;

import com.springboot.userservice.entity.User;
import com.springboot.userservice.pojo.Department;
import com.springboot.userservice.pojo.UserDepartmentVO;
import com.springboot.userservice.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User getUserById(Long aLong) {
        Optional<User> optionalUser = userRepository.findById(aLong);
        return (optionalUser.orElse(null));
    }

    public User saveUser(User user) {
        log.info("User service saveUser");
        User save = userRepository.save(user);
        return save;
    }

    public UserDepartmentVO getUserWithDepartment(Long id) {
        Long aLong = Long.valueOf(id);
        Optional<User> optionalUser = userRepository.findById(aLong);
        User user = optionalUser.orElse(null);
        String url = "http://localhost:9002/api/departments/"+user.getDepartmentId();
        ResponseEntity<Department> response = restTemplate.exchange(url, HttpMethod.GET, null, Department.class);
        Department department = response.getBody();
        UserDepartmentVO vo = new UserDepartmentVO();
        vo.setDepartment(department);
        vo.setUser(user);
        return vo;
    }
}

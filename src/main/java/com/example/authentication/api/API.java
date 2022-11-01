package com.example.authentication.api;

import com.example.authentication.entity.User;
import com.example.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class API {

    @Autowired
    UserRepository userRepository;

    @GetMapping("hello")
    public String hello() {
        return "Doesn't need Authentication";
    }

    @GetMapping("authen")
    public String hi() {
        return "Authenticated";
    }

    @GetMapping("getAll")
    public List<User> getAllUser() {
        return (List) userRepository.findAll();
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> register(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Register successfully");
    }
}

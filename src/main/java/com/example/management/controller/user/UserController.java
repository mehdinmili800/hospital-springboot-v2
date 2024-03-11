package com.example.management.controller.user;

import com.example.management.dto.user.UserResponseDTO;
import com.example.management.entity.user.User;
import com.example.management.service.user.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping(value = "/user/create")
    public ResponseEntity<?> addUser(@RequestBody UserResponseDTO userResponseDTO){
        User user = userService.save(userResponseDTO);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

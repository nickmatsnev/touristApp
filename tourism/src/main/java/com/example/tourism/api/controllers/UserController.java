package com.example.tourism.api.controllers;


import com.example.tourism.api.dto.RegisterUserDTO;
import com.example.tourism.business.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterUserDTO user) {
        try {
            System.out.println(user.getName());
            System.out.println(user.getSurname());
            userService.createUser(user.getUser_id(), user.getName(), user.getEmail(), user.getEmail(),  user.getPassword(), user.getWallet());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(
                user.getName(),
                HttpStatus.OK);
    }
}

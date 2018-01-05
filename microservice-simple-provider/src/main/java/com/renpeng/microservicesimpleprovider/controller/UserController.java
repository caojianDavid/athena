package com.renpeng.microservicesimpleprovider.controller;

import com.renpeng.microservicesimpleprovider.entity.User;
import com.renpeng.microservicesimpleprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/user/{id}")
    public User findUser(@PathVariable long id)
    {
      return userRepository.findOne(id);
    }
}

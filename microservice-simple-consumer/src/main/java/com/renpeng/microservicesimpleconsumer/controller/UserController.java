package com.renpeng.microservicesimpleconsumer.controller;

import com.renpeng.microservicesimpleconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate testTemplate;
    @GetMapping("user/{id}")
    public User getUser(@PathVariable long id)
    {
        return this.testTemplate.getForObject("http://localhost:7900/user/"+id,User.class);
    }
}

package com.my.test.sbmm2.web.controller;

import com.my.sbmm2.user.entity.po.User;
import com.my.sbmm2.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Resource
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "success";
    }

    @GetMapping("users/{id}")
    public Optional<User> user(@PathVariable long id) {
        return userService.findById(id);
    }

    @GetMapping("users")
    public List<User> findUserByName(String name) {
        return userService.findByName(name);
    }

}

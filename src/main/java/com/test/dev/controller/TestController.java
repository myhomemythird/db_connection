package com.test.dev.controller;

import com.test.dev.domains.User;
import com.test.dev.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/user-list")
    public List<User> getUserList() {
        return testService.getUserList();
    }
}

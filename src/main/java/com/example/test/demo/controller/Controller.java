package com.example.test.demo.controller;

import com.example.test.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
//    private Service service;
    @Autowired
    Service service;
    @GetMapping("/hello/{v}")
    String test1(@PathVariable("v")String v) {
        return service.test(v);
    }
}

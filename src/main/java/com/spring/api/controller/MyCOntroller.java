package com.spring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class MyCOntroller {

    @GetMapping("/aa")
    public String test(){
        return "Hello world";
    }

}

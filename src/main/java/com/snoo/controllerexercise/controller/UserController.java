package com.snoo.controllerexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/user/paid")
    public String getPaidUser() {
        return "I'm a paid user.";
    }
    @RequestMapping(value = "/user/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }
}

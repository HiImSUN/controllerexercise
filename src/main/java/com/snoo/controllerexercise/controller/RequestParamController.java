package com.snoo.controllerexercise.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    // 이건 Query String
    @RequestMapping(value = "/post")
    public String getPost(@RequestParam(name = "category", required = false, defaultValue = "it") String category,
                          @RequestParam(name = "id") Integer id){
        return "You requested " + category + " - " + id + "post";
    }
    // 이번엔 Path Parameter
    @RequestMapping(value = "/user/{type}/id/{id}")
    public String getUser(@PathVariable(name = "type") String type,
                          @PathVariable(name = "id") Integer id){
        return "You requested " + type + " - " + id + "user";
    }
}

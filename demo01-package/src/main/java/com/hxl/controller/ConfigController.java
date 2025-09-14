package com.hxl.controller;

import com.hxl.ConfigMain;
import com.hxl.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private ConfigService service;

    @GetMapping("get")
    public String get(){
        return service.get();
    }

}

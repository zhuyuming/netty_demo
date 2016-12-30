package com.eleme.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuyuming on 2016/12/30.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello,world!";
    }
}

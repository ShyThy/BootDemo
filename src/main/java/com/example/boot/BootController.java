package com.example.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by thy on 2017/11/17.
 */
@RestController
public class BootController {

    @RequestMapping(value = "/hello")
    public String hellBoot(){
        return "Hello world";
    }

    public String hi(HttpServletRequest r) {
        return "a";
    }
}

package com.example.helloworld.controller;

import com.example.helloworld.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //    http://localhost:8080/hello?nickname=zhangsan&phone=123
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String nickname, String phone) {
        System.out.println(phone);
        return "Hello," + nickname;
    }

    @RequestMapping(value = "/postTest1", method = RequestMethod.POST)
    public String postTest1() {
        return "POST请求";
    }

    @RequestMapping(value = "/postTest2", method = RequestMethod.POST)
    public String postTest2(String nickname, String password) {
        System.out.println(nickname);
        System.out.println(password);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3", method = RequestMethod.POST)
    public String postTest3(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "POST请求";
    }

    @RequestMapping(value = "/postTest4", method = RequestMethod.POST)
    public String postTest4(@RequestBody User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "POST JSON格式请求";
    }

}

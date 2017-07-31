package com.example.controller;

import com.example.module.FeedBack;
import com.example.module.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wk on 2017/7/30.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public FeedBack<String> login(@RequestBody User user){
        if (userService.setUser(user)!=0){
            return new FeedBack<>(200,"ok","");
        }
        else return new FeedBack<>(201,"no","");
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public FeedBack<User> test(@RequestBody User user){

        return new FeedBack<User>(200,"ok",user);
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }
}

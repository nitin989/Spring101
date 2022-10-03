package com.nkc.springbootdemo.controller;

import com.nkc.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "Hello Nitin !!!";
    }

    //@RequestMapping(value = "/user" , method =  RequestMethod.GET)
    @GetMapping("/user")
    public User getUser()
    {
        User user = new User();
        user.setName("Nitin Choudhary");
        user.setId("1");
        user.setEmailId("nkc0190@gmail.com");
        return user;

    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id)
    {
        return "The path variable is: " + id ;
    }

    @GetMapping( "/requestParam")
    public String requestParams(@RequestParam String name , @RequestParam(name = "email" , required = false , defaultValue = "") String emailId){

            return "Your name is : " + name + " and email id is : " + emailId ;
    }

}

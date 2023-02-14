package com.wuwei.java0116.controller;

import com.wuwei.java0116.po.User;
import com.wuwei.java0116.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
        @Autowired
        UserService userService;

        @RequestMapping("/login")
        public String login(String loginname,String password){
                User user = userService.select(loginname, password);
                if (user==null){
                        System.out.println("adsas");
                        System.out.println("adsas");
                        return "index";
                }

                return "main";
        }

}

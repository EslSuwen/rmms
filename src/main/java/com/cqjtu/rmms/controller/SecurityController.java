package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.User;
import com.cqjtu.rmms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private UserService userService ;

    @RequestMapping("/index")
    public String root() {
        return "index";
    }

    @GetMapping("/toLogin")
    public String toLogin(Map<String, Object> map) {

        map.put("user", new User());

        return "login";
    }


    @PostMapping(value="/login")
    public String login(User user,Map<String, Object> map){

        if(userService.get(user.getUserNo())!=null){
            User user1=userService.get(user.getUserNo());
            if(user1.getUserPwd().equals(user.getUserPwd())){
                map.put("user",user1);
                return "main";
            }
        }


        return "login";
    }

    @GetMapping("/mainController")
    public String main(){

        return "main";
    }

    @GetMapping("/logout")
    public String logout(){

        return "redirect:/security/toLogin";

    }

}
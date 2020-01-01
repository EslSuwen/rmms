package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.User;

import com.cqjtu.rmms.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 访问用户输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        map.put("user", new User());

        return "user/input_user";
    }

    /**
     * 创建新用户
     */
    @PostMapping(value = "/create")
    public String create(User user) {

        userService.addUser(user);

        return "redirect:/user/list";

    }

    @GetMapping("/list")
    public String list(Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

        int pageNo = 1;

        //对 pageNo 的校验
        pageNo = Integer.parseInt(pageNoStr);
        if (pageNo < 1) {
            pageNo = 1;
        }

        /*
         * 第一个参数：第几页;
         * 第二个参数：每页获取的条数.
         */
        PageHelper.startPage(pageNo, 20);
        List<User> userList = userService.loadDistinct();
//        List<User> userList = userService.loadAll();
        PageInfo<User> page = new PageInfo<>(userList);

        System.out.println(userList.size());

        map.put("page", page);

        return "user/list_user";
    }

    @GetMapping(value = "/remove/{userNo}")
    public String remove(@PathVariable("userNo") Integer userNo) {

        userService.removeUser(userNo);
        return "redirect:/user/list";
    }

    @GetMapping(value = "/preUpdate/{userNo}")
    public String preUpdate(@PathVariable("userNo") Integer userNo, Map<String, Object> map) {
        System.out.println(userService.getUserById(userNo));
        map.put("user", userService.getUserById(userNo));

        return "user/update_user";
    }

    @RequestMapping(value = "/update")
    public String update(User user) {

        userService.updateUser(user);
        return "redirect:/user/list";
    }
}

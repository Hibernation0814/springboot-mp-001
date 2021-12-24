package com.lsy.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lsy.entity.User;
import com.lsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Long
 * @since 2021-12-21
 */
@RestController
//@RequestMapping("/User")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers() {
        List<User> users = userService.list();
        return users;
    }

    @GetMapping("/getUsersById")
    public User getUsersById(Integer id) {
        User user =userService.getById(id);
        return user;
    }

    @RequestMapping("/info")
    public String requre() {
        return "小龙Hibernation";
    }

    @GetMapping("/getByPage")
    public Page<User> getByPage(@RequestParam(value = "current", required = true, defaultValue = "1") Integer current,
                              @RequestParam(value = "size", required = true, defaultValue = "2") Integer size) {
        Page<User> page = new Page<>(current,size);
        Page<User> userPage = userService.page(page);
        return userPage;
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody User user) {
        boolean b = userService.updateById(user);
        return b;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody User user) {
        System.out.println(user.toString());
        boolean b = userService.save(user);
        return b;
    }

    @DeleteMapping("/delete")
    public Boolean delete(Integer id) {
        boolean b = userService.removeById(id);
        return b;
    }


}


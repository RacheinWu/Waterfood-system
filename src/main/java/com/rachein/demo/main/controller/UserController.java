package com.rachein.demo.main.controller;

import com.rachein.demo.entity.RO.UserAddRo;
import com.rachein.demo.entity.RO.UserLoginRo;
import com.rachein.demo.entity.RO.UserUpdateRo;
import com.rachein.demo.main.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:54
 */
@Api("用户")
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public void login(@RequestBody UserLoginRo userLoginRo) {
        userService.login();
    }

    @ApiOperation("添加")
    @PostMapping("/add")
    public void create(@RequestBody UserAddRo userAddRo) {
        userService.add();
    }

    @ApiOperation("退出")
    @GetMapping("/quit")
    public void quit() {
        userService.quit();
    }

    @ApiOperation("修改")
    @PostMapping("/update")
    public void update(@RequestBody UserUpdateRo userUpdateRo) {
        userService.update(userUpdateRo);
    }

    @ApiOperation("查阅")
    @GetMapping("/{uid}")
    public void read(@PathVariable String uid) {
        userService.read(uid);
    }

    @ApiOperation("查阅全部")
    @GetMapping("/all")
    public void read() {
        userService.read();
    }

    @ApiOperation("注销")
    @GetMapping("/delete/{tid}")
    public void delete(@PathVariable String tid) {
        userService.delete(tid);
    }
}

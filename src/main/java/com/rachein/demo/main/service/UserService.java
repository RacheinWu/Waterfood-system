package com.rachein.demo.main.service;

import com.rachein.demo.entity.RO.UserUpdateRo;

/**
 * @author 计算机系 ITAEM 吴远健
 * @Description
 * @date 2022/4/14 11:52
 */
public interface UserService {
    void login();

    void add();

    void quit();

    void update(UserUpdateRo userUpdateRo);

    void read(String uid);

    void read();

    void delete(String tid);
}


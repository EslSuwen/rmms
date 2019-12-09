package com.cqjtu.rmms.service;

import com.cqjtu.rmms.entity.User;

import java.util.List;


public interface UserService {

    /**
     * 获取一条用户数据
     *
     * @param  userNo
     * @return User
     *
     */
    User get(String userNo);


    /**
     * 新增一条用户数据
     *
     * @param  user
     * @return User
     *
     */
    void addUser(User user);


    /**
     * 删除一条用户数据记录
     *
     * @param  userId
     *
     */
    void removeUser(Integer userId);

    /**
     * 更新一条用户记录
     *
     * @param user
     *
     */
    void updateUser(User user);

    /**
     * 获取一条课程类型记录
     *
     * @param userId
     * @return User
     *
     */
    User getUserById(Integer userId);

    /**
     *  获取所有课程类型记录
     *
     * @return List
     *
     */
    List<User> loadAll();

}


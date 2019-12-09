package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.CourseType;
import com.cqjtu.rmms.entity.User;
import com.cqjtu.rmms.mapper.UserMapper;
import com.cqjtu.rmms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Override
    public User get(String userNo) {

        User user = null;
        user=userMapper.selectByPrimaryKey(userNo);
        return user;

    }

    @Override
    public void addUser(User user) {

        userMapper.insert(user);

    }

    @Override
    public List<User> loadAll() {

        return userMapper.selectAll();

    }

    @Override
    public void removeUser(Integer userId) {

        userMapper.deleteByPrimaryKey(userId);

    }

    @Override
    public void updateUser(User user) {

        userMapper.updateByPrimaryKey(user);

    }

    @Override
    public User getUserById(Integer userId) {

        return userMapper.selectByPrimaryKey(userId);

    }

}
package com.cqjtu.rmms.service.impl;

import com.cqjtu.rmms.entity.User;
import com.cqjtu.rmms.mapper.UserMapper;
import com.cqjtu.rmms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(String userNo) {

        User user = null;
        user = userMapper.selectByPrimaryKey(userNo);
        return user;

    }

    @Override
    public void addUser(User user) {

        userMapper.insert(user);

    }

    @Override
    public List<User> loadAll() {

        return userMapper.selectAll();
/**
 * 测试 mapper.select()
 *
 User user = new User();
 user.setUserNo("000007");
 user.setUserName("厂子7");

 List<User> userList = userMapper.select(user);

 Set<User> userSet = new TreeSet<>(Comparator.comparing(User::getUserName));
 userSet.addAll(userList);
 return new ArrayList<>(userSet);
 */

    }

    @Override
    public List<User> loadDistinct() {
        /*List<User> userList = userMapper.selectAll();
        System.out.println("selectAll"+userList.size());
        List<String> distinct = new ArrayList<>();
        List<User> userDistinctList = new ArrayList<>();
        int flag;
        for (User each : userList) {
            flag = 0;
            System.out.println(each.getUserName());
            for (String name : distinct) {
                if (each.getUserName().equals(name)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                continue;
            distinct.add(each.getUserName());
            System.out.println(each.getUserName());
            userDistinctList.add(each);
        }

        return userDistinctList;*/
        List<User> userList = userMapper.selectAll();

        Set<User> userSet = new TreeSet<>(Comparator.comparing(User::getUserName));
        userSet.addAll(userList);
        return new ArrayList<>(userSet);
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

    /**
     * 注解式
     * 自定义 mappper 方法调用
     *
     * @param userName
     * @return
     */
    public User getUserByName(String userName) {
        return userMapper.selectByUserName(userName);
    }

}
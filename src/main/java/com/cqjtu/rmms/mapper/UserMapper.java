package com.cqjtu.rmms.mapper;


import com.cqjtu.rmms.entity.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
    @Select("select * from users where username = #{username}")
    User selectByUserName(String username);
}

package com.yjg.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public User userInfo(String uid);

    public List<User> userList(@Param("uid") String uid,
                               @Param("username") String username);

}

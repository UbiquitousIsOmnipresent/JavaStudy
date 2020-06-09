package com.zhou2.mapper;

import com.zhou2.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int addUser2(Map<String, Object> map);

    int deleteUser(int id);
}

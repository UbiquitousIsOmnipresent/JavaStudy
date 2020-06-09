package com.zhou2.mapper;

import com.zhou2.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{
    //我们的所有操作都使用sqlSession来执行

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();
    }

    public User getUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser(id);
    }

    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int updateUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.updateUser(user);
    }

    public int addUser2(Map<String, Object> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser2(map);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

}

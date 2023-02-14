package com.wuwei.java0116.services.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuwei.java0116.mapper.UserMapper;
import com.wuwei.java0116.po.User;
import com.wuwei.java0116.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insert() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public List<User> selectall() {
        return null;
    }

    @Override
    public User select(String loginname, String password) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("loginname",loginname);
        userQueryWrapper.eq("password",password);


        return userMapper.selectOne(userQueryWrapper);
    }
}

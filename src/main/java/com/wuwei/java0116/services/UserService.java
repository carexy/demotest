package com.wuwei.java0116.services;

import com.wuwei.java0116.po.User;

import java.util.List;

public interface UserService {
    public int insert();
    public int delete();
    public int update();
    public List<User> selectall();
    public User select(String loginname,String password);
}

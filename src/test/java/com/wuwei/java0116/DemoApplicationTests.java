package com.wuwei.java0116;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuwei.java0116.mapper.UserMapper;
import com.wuwei.java0116.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userid","110");
        List<User> users = userMapper.selectList(userQueryWrapper);
        System.out.println(users);


    }

}

package com.wuwei.java0116.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_user")
public class User {
    private  Integer userid;
    private String loginname;
    private  String password;
}

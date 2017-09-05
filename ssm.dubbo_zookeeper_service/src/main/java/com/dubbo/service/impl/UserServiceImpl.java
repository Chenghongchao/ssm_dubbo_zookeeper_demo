package com.dubbo.service.impl;

import com.dubbo.dao.UserMapper;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by chenghongchao on 2017/9/4.
 * Supported By 甜瓜移动.
 * Official Website: www.melonmobile.cn.
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userdao;
    public int addUser(Map map) {
        return userdao.insert(map);
    }
}

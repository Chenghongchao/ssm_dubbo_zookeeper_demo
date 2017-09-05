package com.dubbo.controller;

import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenghongchao on 2017/9/5.
 * Supported By 甜瓜移动.
 * Official Website: www.melonmobile.cn.
 */
@Controller
@RequestMapping("/user")
public class UserController {
        @Autowired
        UserService userservice;

        private Map<String,Object> map=new HashMap<String,Object>();

        @RequestMapping(value = "adduser.json",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
        @ResponseBody
        public Map addUser(@RequestParam Map<String,String> maps){
            maps.get("userName");
            maps.get("userPassword");
            int a=userservice.addUser(maps);
            if(a>0){
                map.clear();
                map.put("code",0);
                map.put("msg","注册成功");
                return map;
            }else{
                map.clear();
                map.put("code",1);
                map.put("msg","失败");
                return map;
            }
        }
    }



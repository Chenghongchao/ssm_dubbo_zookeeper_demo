package com.dubbo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by chenghongchao on 2017/8/16.
 * Supported By 甜瓜移动.
 * Official Website: www.melonmobile.cn.
 */
@Controller
@RequestMapping("user")
public class test {
    @RequestMapping(value = "user.json",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map getUser(@RequestParam Map<String,String> maps){
        maps.put("code","sdsd");
        return maps;
    }
}

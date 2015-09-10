package com.albert.spring.mybatis.web;

import com.albert.spring.mybatis.entity.User;
import com.albert.spring.mybatis.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @Autowired
    UserService userService;

    Log log = LogFactory.getLog(UserAction.class);

    @RequestMapping("add")
    public void addUser(User user){
        log.info("request url: /add");
        log.info("request params: " + user);
        userService.addUser(user);
    }
}

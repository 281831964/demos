package com.albert.spring.mybatis.web;

import com.albert.spring.mybatis.util.HttpTookit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/ApplicationContext.xml"})
public class TestUserAction {

    public static final String HOST = "http://localhost:8080";
    public static final String PROJECT = "mybatis";

    public String url(String relatePath) {
        if (relatePath.startsWith("/"))
            return HOST + "/" + PROJECT + relatePath;
        return HOST + "/" + PROJECT + "/" + relatePath;
    }

    @Test
    public void testAdd(){
        Map<String, String> param = new HashMap<String, String>();
        param.put("account","albert");
        param.put("name","cyh");
        String result = HttpTookit.doPost(url("/add"), param, "UTF-8");
        System.out.println(result);
    }
}

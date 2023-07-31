package com.ipsa.test;

import com.ipsa.entity.User;
import com.ipsa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        User user = userService.queryOne(1);
        log.info("结果是：{}",user);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setId(4);
        user.setName("小花");
        user.setPassword("11111111");
    }
}

package com.ipsa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ipsa.entity.User;
import com.ipsa.service.UserService;
import com.ipsa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author iss
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-07-25 10:33:58
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User queryOne(int id){
        User user = userMapper.selectById(id);
        return user;
    }
}
package com.ipsa.service;

import com.ipsa.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author iss
* @description 针对表【user】的数据库操作Service
* @createDate 2023-07-25 10:33:58
*/
public interface UserService extends IService<User> {

    User queryOne(int id);
}

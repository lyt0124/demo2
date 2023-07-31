package com.ipsa.mapper;

import com.ipsa.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author iss
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-07-25 10:33:58
* @Entity com.ipsa.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





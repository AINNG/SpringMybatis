package com.whuse.mapper;

import com.whuse.pojo.User;

import java.util.List;

/**
 * @author 王子安
 * @date 2022/11/6 - 10:26
 */
public interface UserMapper {
    public List<User> selectUser();
}

package com.whuse.mapper;

import com.whuse.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 王子安
 * @date 2022/11/6 - 11:45
 */
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //原来：我们的所有操作，都是用sqlsession执行。
//现在：使用SqlsessionTemplate

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

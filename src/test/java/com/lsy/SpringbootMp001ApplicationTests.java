package com.lsy;

import com.lsy.entity.User;
import com.lsy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMp001ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所以列表
     */
    @Test
    void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> users = userMapper.selectList(null);
        users.forEach(user -> {
            System.out.println(user.toString());
        });
    }

}

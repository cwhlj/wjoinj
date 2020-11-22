package com.wei.demo.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author chengwei
 * @Description:
 * @Date 2020/11/22 4:18 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {
    @Autowired
    private User user;

    @Test
    public void userTest(){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getBirthday());
        System.out.println(user.getEnvironmentName());
    }


}

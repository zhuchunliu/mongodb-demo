package com.mongo.repository;

import com.mongo.start.MongoStart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zcl on 2019/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MongoStart.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void findOne() throws Exception {
        User user = userService.findOne(3L);
        System.out.println(user);
        assertEquals("null",user.getPassword());
    }

    @Test
    public void save() throws Exception {
        User user = new User(3L,"convertor","null",0);
        assertEquals("convertor",userService.save(user).getUsername());
    }

    @Test
    public void queryAll() throws Exception {
        List<User> list = userService.queryAll();
        assertEquals(3,list.size());
    }
}

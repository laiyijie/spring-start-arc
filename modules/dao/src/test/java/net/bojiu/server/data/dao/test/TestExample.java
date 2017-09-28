package net.bojiu.server.data.dao.test;

import net.bojiu.server.data.dao.tbUserMapper;
import net.bojiu.server.data.domain.tbUser;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-context.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExample {

    @Autowired
    tbUserMapper userMapper;

    @Test
    public void TestInsert(){
        tbUser user = new tbUser();
        user.setLast_login_time(1L);
        user.setRegister_time(1L);
        userMapper.insert(user);
    }

}

package me.laiyijie.server.data.dao.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import me.laiyijie.server.data.dao.TbUserMapper;
import me.laiyijie.server.data.domain.TbUser;
import me.laiyijie.server.data.domain.TbUserCriteria;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by laiyijie on 9/29/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ExampleTest {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Test
    public void Test(){
        TbUserCriteria criteria = new TbUserCriteria();
        criteria.or().andIDEqualTo(100);
        tbUserMapper.countByExample(criteria);
    }
}

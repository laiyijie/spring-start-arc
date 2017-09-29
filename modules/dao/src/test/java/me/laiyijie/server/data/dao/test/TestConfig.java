package me.laiyijie.server.data.dao.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.flywaydb.core.Flyway;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.Resource;
import javax.sql.DataSource;
import java.util.Properties;
/**
 * Created by laiyijie on 9/29/17.
 */
@MapperScan(basePackages = "me.laiyijie.server.data")
@SpringBootConfiguration
public class TestConfig {

    @Value("${me.jdbc.url}")
    private String jdbcUrl;
    @Value("${me.jdbc.driverClass}")
    private String jdbcDriverClassName;
    @Value("${me.jdbc.username}")
    private String jdbcUsername;
    @Value("${me.jdbc.password}")
    private String jdbcPassword;

    @Value("${me.mybatis.sqlSessionFactory.mapperLocations}")
    private Resource[] mapperLocations;
    @Value("${me.mybatis.scanner.basePackage}")
    private String mybatisScannerBasePackage;


    @Bean(destroyMethod = "close")
    public DataSource mysqlDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcDriverClassName);
        druidDataSource.setUrl(jdbcUrl);
        druidDataSource.setUsername(jdbcUsername);
        druidDataSource.setPassword(jdbcPassword);
        return druidDataSource;
    }

    @Bean(value = "flyway",initMethod = "migrate")
    public Flyway flyway(){
        Flyway flyway = new Flyway();
        flyway.setDataSource(mysqlDataSource());
        return flyway;
    }

    @Bean
    @DependsOn("flyway")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        Interceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect","mysql");
        pageInterceptor.setProperties(properties);
        Interceptor[] interceptors={pageInterceptor};
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(mysqlDataSource());
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);
        sqlSessionFactoryBean.setPlugins(interceptors);
        return (SqlSessionFactory) sqlSessionFactoryBean.getObject();
    }

}

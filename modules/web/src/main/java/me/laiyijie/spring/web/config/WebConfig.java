package me.laiyijie.spring.web.config;

import me.laiyijie.spring.log.web.AccessLogFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;

/**
 * Created by admin on 2017/9/24.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new PermissionInterceptor())
//                .addPathPatterns("/**");
    }

    @Bean
    public Filter loggingFilter() {
        return new AccessLogFilter();
    }
    @Bean
    public Filter characterEncodingFilter(){
        return new CharacterEncodingFilter("UTF-8",true,true);
    }

}

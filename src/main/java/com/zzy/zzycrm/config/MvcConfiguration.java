package com.zzy.zzycrm.config;


import com.zzy.zzycrm.Inteceptor.LoginInteceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author pan_l
 * @ClassName MvcConfiguration
 * @Description
 * @date 2019-07-17 15:51
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    @Override
    //需要告知系统，这是要被当成静态文件的！
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 设置文件上传的文件不拦截
        // registry.addResourceHandler("/upload/**").addResourceLocations("file:"+ TaleUtils.getUplodFilePath()+"upload/");
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new LoginInteceptor());
        registration.addPathPatterns("/customer/**");
        registration.addPathPatterns("/Order/**");

    }

}

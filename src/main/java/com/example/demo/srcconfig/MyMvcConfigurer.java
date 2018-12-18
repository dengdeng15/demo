package com.example.demo.srcconfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/*
 * 由于SpringBoot2.0之前,我们使用的WebMvcConfigurerAdapter来进行url重定向,现在已经过期了,
 * 而之后我们有两种方法来实现上述的功能:
 * 1.继承 WebMvcConfigurationSupport方法(有两种写法)
 * 2.实现 WebMvcConfigurer接口(这里推荐用这种,相对便捷)
 */
@Configuration
public class MyMvcConfigurer extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");  //转发
    }

    /*
     * 注册拦截器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }
}

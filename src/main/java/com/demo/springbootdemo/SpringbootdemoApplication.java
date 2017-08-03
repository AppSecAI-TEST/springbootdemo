package com.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

import com.demo.springbootdemo.servlet.MyServlet;
//主Application
@SpringBootApplication
//启用servlet filter listener注解 
@ServletComponentScan   
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	
    /**
     * s手动注册
     *
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     * "/xs/*" servlet 请求匹配
     * 
     * 修改DispatcherServlet默认配置
     * Spring boot 的主 Servlet 为 DispatcherServlet，其默认的url-pattern为“/”
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;
    }
    /**
     * 手动注册
     *
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     * "/xs/*" servlet 请求匹配
     */
    @Bean
    public ServletRegistrationBean registratMyServlet() {
        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
    }
}

package com.demo.springbootdemo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * 服务启动执行
 *
 */
@Component
@Order(value=1)//启动优先级
public class MyStartupRunner2 implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 22222222 <<<<<<<<<<<<<");

	}

}

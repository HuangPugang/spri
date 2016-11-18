package com.example;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EnableTransactionManagement
public class MybApplication {
//	@Resource(name="txManager1")
//	private PlatformTransactionManager txManager2;


//	// 创建事务管理器1
//	@Bean(name = "txManager1")
//	public PlatformTransactionManager txManager(DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}

	public static void main(String[] args) {
		SpringApplication.run(MybApplication.class, args);
	}

}

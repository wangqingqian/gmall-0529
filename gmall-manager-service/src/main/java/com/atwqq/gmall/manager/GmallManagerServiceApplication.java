package com.atwqq.gmall.manager;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//扫描所有的mybatis的mapper文件
@EnableTransactionManagement//开启基于注解事物功能
@EnableDubbo//开启dubbo
@MapperScan("com.atwqq.gmall.manager.mapper")
@SpringBootApplication
public class GmallManagerServiceApplication {
    /**
     * 即使不依赖web容器dubbo会自动阻塞主线程，防止主线程停止，dubbo停止
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(GmallManagerServiceApplication.class, args);
    }
}

package com.atwqq.gmall.manager.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 13:45
 */
@Configuration
public class MybatisPlusConfig {
    @Bean//给容器中添加一个逻辑删除组件
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}

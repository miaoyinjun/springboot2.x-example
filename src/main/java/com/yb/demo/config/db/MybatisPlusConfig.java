package com.yb.demo.config.db;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daoshenzzg@163.com
 * @date 2019-09-05 09:41
 */
@Configuration
@MapperScan({"com.yb.demo.dao.mapper"})
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLimit(100);
        return paginationInterceptor;
    }
}

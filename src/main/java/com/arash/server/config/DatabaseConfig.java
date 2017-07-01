package com.arash.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 *
 * @author arasshchektaiev
 */
@Configuration
@EnableJpaRepositories(value = "com.arash.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(value = "com.arash.server.repository")
public class DatabaseConfig {

    @Resource
    private Environment environment;
}

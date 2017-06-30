package com.arash.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author arasshchektaiev
 */
@Configuration
@EnableWebMvc
@ComponentScan(value = "com.arash.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
